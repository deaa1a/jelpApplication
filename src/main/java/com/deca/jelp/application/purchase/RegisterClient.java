package com.deca.jelp.application.purchase;

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

    public void Execute (Names names, SurName surName, SecondSurName secondSurName, CellphoneNumber cellphoneNumber, IdNumber idNumber, CityIdentifyCard cityIdentifyCard, CityResidence cityResidence){
        customerRegistration.save(names, surName, secondSurName, cellphoneNumber, idNumber, cityIdentifyCard, cityResidence);
    }
}
