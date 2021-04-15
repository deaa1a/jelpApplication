package com.deca.jelp.domain.customer;

public class Customer {

    private IdNumber idNumber;
    private CellphoneNumber cellphoneNumber;
    private Name name;

    public Customer(IdNumber idNumber, CellphoneNumber cellphoneNumber, Name name) {
        this.idNumber = idNumber;
        this.cellphoneNumber = cellphoneNumber;
        this.name = name;
    }

    

}
