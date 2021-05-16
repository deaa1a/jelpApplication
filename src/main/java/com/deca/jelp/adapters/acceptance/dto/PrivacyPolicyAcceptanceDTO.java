package com.deca.jelp.adapters.acceptance.dto;

import com.deca.jelp.domain.otp.PrivacyPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PrivacyPolicyAcceptanceDTO {

    @JsonProperty(value = "customer_id")
    private String customerId;
    private String otp;



    public PrivacyPolicy toPrivacyPolicyDomain(){
       return new PrivacyPolicy(
               this.otp ,  ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/Bogota"))
       );
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
