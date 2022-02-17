package com.example.matchupback;

import com.example.matchupback.Model.UserAd;
import com.example.matchupback.Repositories.UserAdRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
class MatchUpBackApplicationTests {

        @Autowired
        MockMvc mockMvc;

        @Autowired
         UserAdRepository userAdRepository;

        @BeforeEach
        void setUp() {
            userAdRepository.deleteAll();
        }

    @Test
    public void returnsExistingAds() throws Exception {

        UserAd userAd = new UserAd(1L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h", "",false);
        userAdRepository.save(userAd);

        mockMvc.perform(get("/ads"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)));
    }

    @Test
    public void returnsAdById() throws Exception {

        UserAd userAd = new UserAd(9L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h", "",false);
        UserAd userAd2 = new UserAd(10L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h", "",false);
        userAdRepository.save(userAd);
        userAdRepository.save(userAd2);

        mockMvc.perform(get("/ads/" + userAd.getId()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(9));

    }

}


