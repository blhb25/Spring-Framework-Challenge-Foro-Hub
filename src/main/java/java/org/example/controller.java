package com.forum.api.controller;

import com.forum.api.model.Topic;
import com.forum.api.repository.TopicRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class TopicControllerTest {
    @Autowired
    private MockMvc mvc;

    @Autowired
    private TopicRepository topicRepository;

    @Test
    @DisplayName("Debería devolver código 400 cuando los datos de entrada son inválidos")
    void createTopic_scenario1() throws Exception {
        var request = """
                {
                    "title": "",
                    "message": "",
                    "authorId": 0,
                    "courseId": 0
                }
                """;

        mvc.perform(post("/topics")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(request))
                .andExpect(status().isBadRequest());
    }

    @Test
    @DisplayName("Debería devolver código 201 cuando los datos de entrada son válidos")
    void createTopic_scenario2() throws Exception {
        var request = """
                {
                    "title": "Duda con Spring",
                    "message": "Tengo un problema con la configuración de seguridad",
                    "authorId": 1,
                    "courseId": 1
                }
                """;

        mvc.perform(post("/topics")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(request))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.title").value("Duda con Spring"));
    }
}
