package com.deca.jelp.domain.client;

public class Client {

    private IdNumber idNumber;
    private CellphoneNumber cellphoneNumber;

    public Client(IdNumber idNumber, CellphoneNumber cellphoneNumber){
        this.cellphoneNumber = cellphoneNumber;
        this.idNumber= idNumber;
    }

}
