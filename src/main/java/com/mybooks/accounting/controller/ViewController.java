package com.mybooks.accounting.controller;

import com.mybooks.accounting.entity.Request;
import com.mybooks.accounting.service.ViewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ViewController {

    private final ViewService viewService;

    public ViewController(ViewService viewService) {
        this.viewService = viewService;
    }

    @GetMapping(value = "/admin/requests")
    List<Request> getRequests(){
        return viewService.getAllCustomerRequests();
    }
}
