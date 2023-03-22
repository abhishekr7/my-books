package com.mybooks.accounting.controller;

import com.mybooks.accounting.service.ViewService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@WebMvcTest(ViewController.class)
class ViewControllerTest {

    @MockBean
    private ViewService viewService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testViewCustomerRequests() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/admin/requests")).andExpect(MockMvcResultMatchers.status().isOk());

        verify(viewService, times(1)).getAllCustomerRequests();
    }
}
