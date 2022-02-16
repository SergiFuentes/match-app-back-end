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
    public void testControllerReturnSampleDataLoaderListWhenPerformGet() throws Exception {

        String expectedJson = "[    {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Maria Perez\",\n" +
                "        \"image\": \"https://images.unsplash.com/photo-1644945570917-1585f682efaa?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80\",\n" +
                "        \"location\": \"Barcelona\",\n" +
                "        \"description\": \"description\",\n" +
                "        \"time\": \"19h-20h\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 2,\n" +
                "        \"name\": \"Juan Gonzalez\",\n" +
                "        \"image\": \"https://images.unsplash.com/photo-1644994141078-4f60ef42aa78?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=436&q=80\",\n" +
                "        \"location\": \"Colombia\",\n" +
                "        \"description\": \"description\",\n" +
                "        \"time\": \"18h-20h\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 3,\n" +
                "        \"name\": \"Carlos Perez\",\n" +
                "        \"image\": \"https://images.unsplash.com/photo-1644896026815-76216723bb47?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxMzd8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60\",\n" +
                "        \"location\": \"Bilbao\",\n" +
                "        \"description\": \"description\",\n" +
                "        \"time\": \"14h-18h\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 4,\n" +
                "        \"name\": \"Juana Perez\",\n" +
                "        \"image\": \"https://images.unsplash.com/photo-1644944693376-de2411390a44?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80\",\n" +
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
                .andExpect(jsonPath("$.[2].image").value("https://images.unsplash.com/photo-1644896026815-76216723bb47?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxMzd8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60"))
                .andExpect(jsonPath("$.[3].location").value("Gijón"))
                .andExpect(jsonPath("$.[0].description").value("description"))
                .andExpect(jsonPath("$.[1].time").value("18h-20h"));
    }
}


