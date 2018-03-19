/*
 * Copyright © 2018 Atomist, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// You are the delta in what you do, not the things you did in the past

package c.a;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(Losgatos1Controller.class)
public class Losgatos1ControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnGreeting() throws Exception {
		this.mockMvc.perform(get("/hello/Rod"))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello Rod!")));
	}

	@Test
	public void shouldNotFindGreetingElsewhere() throws Exception {
		this.mockMvc.perform(get("/hey/man"))
				.andExpect(status().isNotFound());
	}

}
