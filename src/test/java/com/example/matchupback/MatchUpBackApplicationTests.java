package com.example.matchupback;

import Model.UserAd;
import Repositories.UserAdRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


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
        void returnsTheExistingUserAds() throws Exception {

            addSampleUserAds();

            mockMvc.perform(get("/ads"))
                    .andExpect(status().isOk())
                    .andExpect((ResultMatcher) jsonPath("$[*]", hasSize(2)))
                    .andExpect((ResultMatcher) jsonPath("$[0].name", equalTo("Carlos Perez")))
                    .andExpect((ResultMatcher) jsonPath("$[1].name", equalTo("Juan Martinez")))
                    .andDo(print());
        }

        private void addSampleUserAds() {
            List<UserAd> userAds = List.of(
                    new UserAd(1L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h"),
                    new UserAd(2L,"Juan Martinez", "no-image", "Barcelona", "description", "19h-20h")

            );

            userAdRepository.saveAll(userAds);
        }
        

    }

