package com.deca.jelp.domain.customer.contactInformation;

public class ContactInformation {

    private CellphoneNumber cellphoneNumber;
    private Address address;
    private Email email;
    private CityResidence cityResidence;

    public ContactInformation(CellphoneNumber cellphoneNumber, Address address, Email email) {
        this.cellphoneNumber = cellphoneNumber;
        this.address = address;
        this.email = email;
    }

    public ContactInformation(Address address, Email email, CityResidence cityResidence){
        this.address = address;
        this.email = email;
        this.cityResidence = cityResidence;
    }

    public ContactInformation(CellphoneNumber cellphoneNumber, Address address, Email email, CityResidence cityResidence) {
        this.cellphoneNumber = cellphoneNumber;
        this.address = address;
        this.email = email;
        this.cityResidence = cityResidence;
    }

    public ContactInformation(CellphoneNumber cellphoneNumber){
        this.cellphoneNumber = cellphoneNumber;
    }



    public CellphoneNumber getCellphoneNumber() {
        return cellphoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public Email getEmail() {
        return email;
    }

    public CityResidence getCityResidence() {
        return cityResidence;
    }

    public void setCellphoneNumber(CellphoneNumber cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setCityResidence(CityResidence cityResidence) {
        this.cityResidence = cityResidence;
    }
}
