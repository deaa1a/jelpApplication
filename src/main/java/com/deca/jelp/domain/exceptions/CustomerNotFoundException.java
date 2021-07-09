package com.deca.jelp.domain.exceptions;

public class CustomerNotFoundException extends Exception{
    String code;
    public CustomerNotFoundException(){
        super("Customer not found");
        this.code = "1-001";
    }

}
