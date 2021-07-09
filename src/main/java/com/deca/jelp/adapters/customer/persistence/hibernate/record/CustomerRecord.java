package com.deca.jelp.adapters.customer.persistence.hibernate.record;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.Name;
import com.deca.jelp.domain.customer.contactInformation.*;
import com.deca.jelp.domain.customer.identificationCard.*;

import javax.persistence.*;

@Entity
@Table(name = "customer", schema = "Jelp")
public class CustomerRecord {

    @Id
    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "first_surname")
    private String firstSurname;

    @Column(name = "second_surname")
    private String secondSurname;

    @Column(name = "cellphone_number")
    private String cellphoneNumber;

    @Column(name = "number_id")
    private String numberId;

    @Column(name = "date_of_issue")
    private String dateOfIssue;

    @Column(name = "expedition_place")
    private String expeditionPlace;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "city_residence")
    private String cityResidence;


    public Customer toDomain(){
        return new Customer(new Name(firstName, secondName, firstSurname, secondSurname),
                new ContactInformation(new CellphoneNumber(cellphoneNumber),
                        new Address(address),
                        new Email(email) ,
                        new CityResidence(cityResidence)) ,
                new IdentificationCard(new DateOfIssue(dateOfIssue),
                        new ExpeditionPlace(expeditionPlace),
                        new NumberId(numberId),
                        new PlaceOfBirth(placeOfBirth)));
    }


    public static CustomerRecord from(Customer customer){
        CustomerRecord record = new CustomerRecord();

        record.setCustomerId(customer.getCustomerId().getValue());
        record.setFirstName(customer.getName().getFirstName());
        record.setNumberId(customer.getIdentificationCard().getIdNumber().getValue());
        record.setCellphoneNumber(customer.getContactInformation().getCellphoneNumber().getValue());

        return record;
    }



    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }


    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurame() {
        return secondSurname;
    }

    public void setSecondSurame(String secondSurame) {
        this.secondSurname = secondSurame;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getExpeditionPlace() {
        return expeditionPlace;
    }

    public void setExpeditionPlace(String expeditionPlace) {
        this.expeditionPlace = expeditionPlace;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCityResidence() {
        return cityResidence;
    }

    public void setCityResidence(String cityResidence) {
        this.cityResidence = cityResidence;
    }
}
