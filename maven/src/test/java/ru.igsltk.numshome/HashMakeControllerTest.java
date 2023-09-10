package ru.igsltk.numshome;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HashMakeController.class)
public class HashMakeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHashEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/hash")
                .param("hashType", "SHA-224")
                .param("textToHash", "qwe")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"hash\": \"0b6a5f4b3ecccf65022006bedfceae103b085bc378a76b8542af8be7\"}"));
    }

}