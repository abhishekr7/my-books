package com.mybooks.accounting.service;

import com.mybooks.accounting.entity.Request;
import com.mybooks.accounting.repository.CustomerRepository;
import java.util.List;

public class ViewService {

    private final CustomerRepository customerRepository;

    public ViewService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Request> getAllCustomerRequests(){
        return customerRepository.findAll();
    }
}
