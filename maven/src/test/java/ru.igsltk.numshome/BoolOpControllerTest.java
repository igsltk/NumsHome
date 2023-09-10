package ru.igsltk.numshome;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(BoolOpController.class)
public class BoolOpControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testIsEqualEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/isequal")
                .param("a", "1.0")
                .param("b", "2.0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"bool\": \"false\"}"));
    }

}