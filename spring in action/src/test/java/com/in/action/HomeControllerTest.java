package com.in.action;

import com.in.action.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
class HomeControllerTest {

    private MockMvc mockMvc;

    @Test
    void testHomePage() throws Exception {
        // Performs GET
        mockMvc.perform(get("/"))
                // Expects HTTP 200
                .andExpect(status().isOk())
                // Expects home view
                .andExpect(view().name("home"))
                // Expects Welcome
                .andExpect(content().string(
                        containsString("Welcome to...")));
    }
}
