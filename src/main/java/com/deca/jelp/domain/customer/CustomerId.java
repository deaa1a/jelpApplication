package com.deca.jelp.domain.customer;

import java.util.UUID;

public class CustomerId {

    private UUID value;

    public CustomerId() {
        this.value = UUID.randomUUID();
    }
}
