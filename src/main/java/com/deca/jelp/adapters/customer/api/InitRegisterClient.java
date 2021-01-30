package com.deca.jelp.adapters.customer.api;

import com.deca.jelp.adapters.jewel.purchase.dto.InitClientDTO;
import com.deca.jelp.application.purchase.RegisterClient;
import com.deca.jelp.domain.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitRegisterClient {

    private final RegisterClient registerClient;

    @Autowired
    public InitRegisterClient(RegisterClient registerClient){
        this.registerClient = registerClient;
    }

    @PostMapping(value = "/customer")
    public void registerClient(@RequestBody InitClientDTO request){
        registerClient.Execute(new Names(request.getNames()),new SurName(request.getSurName()), new SecondSurName(request.getSecondSurName()),new CellphoneNumber(request.getCellphoneNumber()), new IdNumber(request.getIdNumber()), new CityIdentifyCard(request.getCityIdentityCard()), new CityResidence(request.getCityResidence()));
    }
}
