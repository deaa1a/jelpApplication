package com.deca.jelp.domain.client;

public class Client {

    private IdNumber idNumber;
    private CellphoneNumber cellphoneNumber;
    private Names name;

    public Client(IdNumber idNumber, CellphoneNumber cellphoneNumber, Names name){
        this.cellphoneNumber = cellphoneNumber;
        this.idNumber= idNumber;
        this.name = name;
    }

}
