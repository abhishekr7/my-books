package com.mybooks.accounting.controller;

import com.mybooks.accounting.service.CustomerRequestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RequestController {
    private final CustomerRequestService customerRequestService;

    public RequestController(CustomerRequestService customerRequestService) {
        this.customerRequestService = customerRequestService;
    }

    @PostMapping(value = "/customer/raise")
    void raiseRequest(){
        //call to a service
        customerRequestService.raiseCustomerRequest();
    }
}
