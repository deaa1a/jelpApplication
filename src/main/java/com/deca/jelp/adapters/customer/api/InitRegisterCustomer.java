package com.deca.jelp.adapters.customer.api;

import com.deca.jelp.adapters.customer.dto.CustomerRequestDTO;
import com.deca.jelp.application.customer.RegisterCustomer;
import com.deca.jelp.domain.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitRegisterCustomer {

    private RegisterCustomer registerCustomer;

    @Autowired
    public InitRegisterCustomer(RegisterCustomer registerCustomer){
        this.registerCustomer = registerCustomer;
    }

    @PostMapping(value = "/customer")
    public void registerCustomer(@RequestBody CustomerRequestDTO request){
        registerCustomer.Execute(
                new Name(request.getFirstName(), request.getSecondName(), request.getFirstSurname(), request.getSecondSurname()),
                new CellphoneNumber(request.getCellphoneNumber()),
                new IdNumber(request.getIdNumber()),
                new DateOfIssue(request.getDateOfIssue()),
                new ExpeditionPlace(request.getExpeditionPlace()),
                new CityResidence(request.getPlaceOfBirth()));

    }
}
