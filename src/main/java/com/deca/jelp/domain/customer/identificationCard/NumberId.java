package com.deca.jelp.domain.customer.identificationCard;

import com.deca.jelp.domain.otp.Otp;

public class NumberId {
    private String value;

    public NumberId(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}