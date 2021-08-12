package com.example.SpringBootWITHAWS;

import com.example.SpringBootWITHAWS.web.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
class ApplicationTests {

	@Autowired // (3)
	private MockMvc mvc; // (4)

	@Test
	public void return_hello() throws Exception{

		String hello = "hello";

		mvc.perform(get("/hello")) // (5)
				.andExpect(status().isOk()) // (6)
				.andExpect(content().string(hello)); // (7)
	}
}
