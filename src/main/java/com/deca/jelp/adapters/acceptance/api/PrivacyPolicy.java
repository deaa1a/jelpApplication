package com.deca.jelp.adapters.acceptance.api;

import com.deca.jelp.adapters.acceptance.dto.PrivacyPolicyRequestDTO;
import com.deca.jelp.adapters.kindJewel.dto.TypeJewelResponseDto;
import com.deca.jelp.application.purchase.SendPrivacyPolicy;
import com.deca.jelp.domain.customer.*;
import com.deca.jelp.domain.customer.contactInformation.CellphoneNumber;
import com.deca.jelp.domain.customer.contactInformation.ContactInformation;
import com.deca.jelp.domain.customer.identificationCard.NumberId;
import com.deca.jelp.domain.customer.identificationCard.IdentificationCard;
import com.deca.jelp.domain.otp.Otp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivacyPolicy {

    private SendPrivacyPolicy sendPrivacyPolicy;

    @Autowired
    public PrivacyPolicy(SendPrivacyPolicy sendPrivacyPolicy){
        this.sendPrivacyPolicy = sendPrivacyPolicy;
    }

    @PostMapping(value = "/privacy-policy")
    public ResponseEntity<CustomerId> sendOtp(@RequestBody PrivacyPolicyRequestDTO request) {
        var customerId =  sendPrivacyPolicy.Execute(
                new Customer(
                        new Name(request.getName()),
                        new ContactInformation(new CellphoneNumber(request.getCellphoneNumber())),
                        new IdentificationCard(new NumberId(request.getIdNumber()))),
                new Otp(4));

        return new ResponseEntity<>( customerId, HttpStatus.CREATED);

    }
}
