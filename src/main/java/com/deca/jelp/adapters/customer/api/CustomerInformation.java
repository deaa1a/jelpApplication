package com.deca.jelp.adapters.customer.api;

import com.deca.jelp.adapters.customer.dto.CustomerRequestDTO;
import com.deca.jelp.application.customer.RegisterCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerInformation {

    private RegisterCustomer registerCustomer;

    @Autowired
    public CustomerInformation(RegisterCustomer registerCustomer){
        this.registerCustomer = registerCustomer;
    }

    @PostMapping(value = "/customer")
    public void registerCustomer(@RequestBody CustomerRequestDTO request){
        registerCustomer.Execute(request.toDomain());
    }
}
