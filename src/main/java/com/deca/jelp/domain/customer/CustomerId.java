package com.deca.jelp.domain.customer;

import java.util.UUID;

public class CustomerId {

    private String value;

    public CustomerId() {
        this.value = UUID.randomUUID().toString();
    }

    public CustomerId(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
