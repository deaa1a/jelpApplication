package com.deca.jelp.domain.customer;

import java.util.UUID;

public class Customer {

    private String idNumber;
    private String cellphoneNumber;
    private String name;
    private UUID customerId;


    public Customer(String idNumber, String cellphoneNumber, String name) {
        this.customerId = UUID.randomUUID();
        this.idNumber = idNumber;
        this.cellphoneNumber = cellphoneNumber;
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public String getName() {
        return name;
    }

    public UUID getCustomerId() {
        return customerId;
    }
}
