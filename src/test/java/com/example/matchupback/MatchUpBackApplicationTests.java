package com.example.matchupback;

import com.example.matchupback.Model.UserAd;
import com.example.matchupback.Repositories.UserAdRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
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
    public void test() throws Exception {

        String expectedJson = "[{\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Carlos Perez\",\n" +
                "        \"image\": \"no-image\",\n" +
                "        \"location\": \"Barcelona\",\n" +
                "        \"description\": \"description\",\n" +
                "        \"time\": \"19h-20h\"\n" +
                "    }]";  //Create JSON of expected result as a string

        mockMvc.perform(get("/ads"))
                .andExpect(status().isOk()) //Check the status code of the response
                .andExpect(content().json(expectedJson)); //Check the JSON of the response
    }
}


