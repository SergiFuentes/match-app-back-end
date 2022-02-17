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

import java.util.List;

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

        UserAd userAd = new UserAd(1L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h");
        userAdRepository.save(userAd);

        mockMvc.perform(get("/ads"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)));
    }

    @Test
    public void returnsAdById() throws Exception {

        UserAd userAd = new UserAd(5L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h");
        UserAd userAd2 = new UserAd(6L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h");
        UserAd userAd3 = new UserAd(7L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h");
        userAdRepository.save(userAd);
        userAdRepository.save(userAd2);
        userAdRepository.save(userAd3);

        mockMvc.perform(get("/ads/" + userAd.getId()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.length()").value("6"))
                .andExpect(jsonPath("$.id").value(5));
    }

}


