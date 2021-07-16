package com.deca.jelp.adapters.customer.api;

import com.deca.jelp.adapters.customer.dto.CustomerRequestDTO;
import com.deca.jelp.application.customer.FillCustomerInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerInformation {

    private FillCustomerInformation fillCustomerInformation;

    @Autowired
    public CustomerInformation(FillCustomerInformation fillCustomerInformation){
        this.fillCustomerInformation = fillCustomerInformation;
    }

    @PostMapping(value = "/customer")
    public void registerCustomer(@RequestBody CustomerRequestDTO request) throws Exception {
        fillCustomerInformation.execute(request.toDomain());
    }
}
