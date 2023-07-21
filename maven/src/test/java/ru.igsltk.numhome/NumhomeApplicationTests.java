package ru.igsltk.numhome;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NumhomeApplicationTests {

	@Test
    public void testSumEndpoint() {
        String endpoint = "http://localhost:8080/api/sum/5/5";
    }
}
