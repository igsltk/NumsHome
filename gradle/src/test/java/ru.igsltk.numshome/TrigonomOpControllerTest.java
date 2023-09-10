package ru.igsltk.numshome;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TrigonomOpController.class)
public class TrigonomOpControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCosEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/cos")
                .param("a", "25.0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"cos\": \"0.9912028118634736\"}"));
    }

    @Test
    public void testSinEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/sin")
                .param("a", "25.0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"sin\": \"-0.13235175009777303\"}"));
    }

    @Test
    public void testTanEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/tan")
                .param("a", "25.0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"tan\": \"-0.13352640702153587\"}"));
    }

    @Test
    public void testCtanEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/ctan")
                .param("a", "25.0")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"ctan\": \"-7.489155308722675\"}"));
    }

}