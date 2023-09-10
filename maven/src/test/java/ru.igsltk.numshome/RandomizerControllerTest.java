//url = "http://localhost:8080/api/rand"
//url = "http://localhost:8080/api/rand/fromto?min=10&max=20"
//url = "http://localhost:8080/api/rand/fixed?numOfSimbols=6"

package ru.igsltk.numshome;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(RandomizerController.class)
public class RandomizerControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testRandEndpoint() throws Exception {
		/*
		mockMvc.perform(MockMvcRequestBuilders.get("/api/isequal")
				.param("a", "1.0")
				.param("b", "2.0")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json("{\"bool\": \"false\"}"));
		*/
	}

	@Test
	public void testRandFromToEndpoint() throws Exception {
		/*
		mockMvc.perform(MockMvcRequestBuilders.get("/api/rand/fromto")
				.param("a", "1.0")
				.param("b", "2.0")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json("{\"bool\": \"false\"}"));
		*/
	}

	@Test
	public void testRandFixedEndpoint() throws Exception {
		/*
		mockMvc.perform(MockMvcRequestBuilders.get("/api/rand/fixed")
				.param("numOfSimbols", "6")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().json("{\"bool\": \"false\"}"));
		*/
	}

}