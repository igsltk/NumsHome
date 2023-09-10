package ru.igsltk.numshome;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(FuncOpController.class)
public class FuncOpControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testDescriminantEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/discriminant")
                .param("b", "3.0")
                .param("a", "2.0")
                .param("c", "1.0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"disc\": \"1.0\"}"));
    }

}