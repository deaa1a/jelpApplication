package com.deca.jelp.application.customer;

import com.deca.jelp.domain.RegisterClient.persitence.CustomerRepository;
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

    public void Execute (Name name, CellphoneNumber cellphoneNumber, IdNumber idNumber, DateOfIssue dateOfIssue, ExpeditionPlace expeditionPlace, CityResidence cityResidence){
        customerRepository.update(
                name,
                cellphoneNumber,
                idNumber,
                dateOfIssue,
                expeditionPlace,
                cityResidence);
    }
}
