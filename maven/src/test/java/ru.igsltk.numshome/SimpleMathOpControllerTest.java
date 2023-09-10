package ru.igsltk.numshome;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(SimpleMathOpController.class)
public class SimpleMathOpControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSumEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/sum")
                .param("a", "20.0")
                .param("b", "20.0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"sum\": \"40.0\"}"));
    }

    @Test
    public void testSubEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/sub")
                .param("a", "45.0")
                .param("b", "5.0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"sub\": \"40.0\"}"));
    }

    @Test
    public void testDivEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/div")
                .param("a", "100.0")
                .param("b", "10.0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"div\": \"10.0\"}"));
    }

    @Test
    public void testModEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/mod")
                .param("a", "68.0")
                .param("b", "2.0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"mod\": \"0.0\"}"));
    }

}