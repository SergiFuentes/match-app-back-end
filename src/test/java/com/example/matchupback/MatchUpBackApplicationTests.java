package com.example.matchupback;

import com.example.matchupback.Repositories.UserAdRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

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
        }

    @Test
    public void test() throws Exception {

        String expectedJson = "[    {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Carlos Perez\",\n" +
                "        \"image\": \"no-image\",\n" +
                "        \"location\": \"Barcelona\",\n" +
                "        \"description\": \"description\",\n" +
                "        \"time\": \"19h-20h\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2,\n" +
                "        \"name\": \"Juan Gonzalez\",\n" +
                "        \"image\": \"no-image\",\n" +
                "        \"location\": \"Colombia\",\n" +
                "        \"description\": \"description\",\n" +
                "        \"time\": \"18h-20h\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 3,\n" +
                "        \"name\": \"Carolta Perez\",\n" +
                "        \"image\": \"no-image\",\n" +
                "        \"location\": \"Bilbao\",\n" +
                "        \"description\": \"description\",\n" +
                "        \"time\": \"14h-18h\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 4,\n" +
                "        \"name\": \"Juana Perez\",\n" +
                "        \"image\": \"no-image\",\n" +
                "        \"location\": \"Gijón\",\n" +
                "        \"description\": \"description\",\n" +
                "        \"time\": \"10h-13h\"\n" +
                "    }]";  //Create JSON of expected result as a string

        mockMvc.perform(get("/ads"))
                .andExpect(status().isOk()) //Check the status code of the response
                .andExpect(content().json(expectedJson)) //Check the JSON of the response
                .andExpect(jsonPath("$.length()").value("4"))
                .andExpect(jsonPath("$.[0].id").value(1))
                .andExpect(jsonPath("$.[1].name").value("Juan Gonzalez"))
                .andExpect(jsonPath("$.[2].image").value("no-image"))
                .andExpect(jsonPath("$.[3].location").value("Gijón"))
                .andExpect(jsonPath("$.[0].description").value("description"))
                .andExpect(jsonPath("$.[1].time").value("18h-20h"));
    }
}


