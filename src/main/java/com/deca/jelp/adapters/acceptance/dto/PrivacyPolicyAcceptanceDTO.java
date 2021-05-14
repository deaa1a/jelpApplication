package com.deca.jelp.adapters.acceptance.dto;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.CustomerId;
import com.deca.jelp.domain.otp.Otp;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PrivacyPolicyAcceptanceDTO {

    @JsonProperty(value = "customer_id")
    private String customerId;
    private String otp;



    public Customer toDomain(){
       return new Customer(
               new CustomerId(customerId),
               new Otp(otp)
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
