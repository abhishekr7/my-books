package com.mybooks.accounting.controller;

import com.mybooks.accounting.entity.Request;
import com.mybooks.accounting.service.CustomerRequestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RequestController {
    private final CustomerRequestService customerRequestService;

    public RequestController(CustomerRequestService customerRequestService) {
        this.customerRequestService = customerRequestService;
    }

    @PostMapping(value = "/customer/raise")
    void raiseRequest(@RequestBody Request request){
        customerRequestService.raiseCustomerRequest(request);
    }
}
