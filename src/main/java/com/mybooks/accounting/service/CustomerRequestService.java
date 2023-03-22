package com.mybooks.accounting.service;

import com.mybooks.accounting.entity.Request;
import com.mybooks.accounting.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerRequestService {
    private final CustomerRepository customerRepository;

    public CustomerRequestService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void raiseCustomerRequest(Request request){
        //make entry into the database
        customerRepository.save(request);
    }
}
