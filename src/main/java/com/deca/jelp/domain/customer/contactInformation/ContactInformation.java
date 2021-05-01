package com.deca.jelp.domain.customer.contactInformation;

public class ContactInformation {

    private CellphoneNumber cellphoneNumber;
    private Address address;
    private Email email;

    public ContactInformation(CellphoneNumber cellphoneNumber, Address address, Email email) {
        this.cellphoneNumber = cellphoneNumber;
        this.address = address;
        this.email = email;
    }

    public ContactInformation(CellphoneNumber cellphoneNumber){
        this.cellphoneNumber = cellphoneNumber;
    }

    public CellphoneNumber getCellphoneNumber() {
        return cellphoneNumber;
    }
}
