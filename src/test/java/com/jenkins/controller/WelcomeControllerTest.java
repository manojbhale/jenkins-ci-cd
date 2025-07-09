package com.jenkins.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
public class WelcomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGreetingsEndpoint() throws Exception {
        String name="manoj bhale";
        mockMvc.perform(MockMvcRequestBuilders.get("/welcome/"+name))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Welcome "+name+" to Jenkins"));
    }
}
