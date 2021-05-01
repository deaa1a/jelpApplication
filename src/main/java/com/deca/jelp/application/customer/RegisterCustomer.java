package com.deca.jelp.application.customer;

import com.deca.jelp.domain.customer.identificationCard.DateOfIssue;
import com.deca.jelp.domain.customer.identificationCard.ExpeditionPlace;
import com.deca.jelp.domain.customer.identificationCard.IdNumber;
import com.deca.jelp.domain.customer.persistence.CustomerRepository;
import com.deca.jelp.domain.customer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterCustomer {

    private CustomerRepository customerRepository;

    @Autowired
    public RegisterCustomer(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public void Execute (Customer customer){
        customerRepository.update(customer);
    }
}
