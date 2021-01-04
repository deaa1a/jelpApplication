package com.deca.jelp.adapters.jewel.purchase.api;

import com.deca.jelp.adapters.jewel.purchase.dto.InitPurchaseRequestDTO;
import com.deca.jelp.application.purchase.SendOtp;
import com.deca.jelp.domain.otp.Otp;
import com.deca.jelp.domain.client.CellphoneNumber;
import com.deca.jelp.domain.client.IdNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitPurchase {

    private SendOtp sendOtp;

    @Autowired
    public InitPurchase(SendOtp sendOtp){
        this.sendOtp = sendOtp;
    }

    @PostMapping(value = "/purchase/otp")
    public void sendOtp(@RequestBody InitPurchaseRequestDTO request){
        sendOtp.Execute(new IdNumber(request.getIdNumber()), new CellphoneNumber(request.getCellphoneNumber()),new Otp(4));
    }
}
