package com.deca.jelp.application.customer;

import com.deca.jelp.domain.RegisterClient.persitence.CustomerRegistration;
import com.deca.jelp.domain.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterClient {

    private final CustomerRegistration customerRegistration;

    @Autowired
    public RegisterClient(CustomerRegistration customerRegistration){
        this.customerRegistration = customerRegistration;
    }

    public void Execute (Name name, CellphoneNumber cellphoneNumber, IdNumber idNumber, CityIdentifyCard cityIdentifyCard, CityResidence cityResidence){
        customerRegistration.save(name,
                cellphoneNumber,
                idNumber,
                cityIdentifyCard,
                cityResidence);
    }
}
