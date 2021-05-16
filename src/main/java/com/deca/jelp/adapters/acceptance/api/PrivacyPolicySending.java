package com.deca.jelp.adapters.acceptance.api;

import com.deca.jelp.adapters.acceptance.dto.PrivacyPolicyRequestDTO;
import com.deca.jelp.application.purchase.SendPrivacyPolicy;
import com.deca.jelp.domain.customer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.deca.jelp.domain.otp.PrivacyPolicy;

@RestController
public class PrivacyPolicySending {

    private SendPrivacyPolicy sendPrivacyPolicy;

    @Autowired
    public PrivacyPolicySending(SendPrivacyPolicy sendPrivacyPolicy){
        this.sendPrivacyPolicy = sendPrivacyPolicy;
    }

    @PostMapping(value = "/privacy-policy")
    public ResponseEntity<CustomerId> sendOtp(@RequestBody PrivacyPolicyRequestDTO request) {
        var customerId =  sendPrivacyPolicy.Execute(request.toDomain(),
                new PrivacyPolicy(4));

        return new ResponseEntity( customerId, HttpStatus.CREATED);
    }
}
