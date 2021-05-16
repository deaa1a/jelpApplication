package com.deca.jelp.adapters.customer.dto;

import com.deca.jelp.domain.customer.CityResidence;
import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.CustomerId;
import com.deca.jelp.domain.customer.Name;
import com.deca.jelp.domain.customer.contactInformation.Address;
import com.deca.jelp.domain.customer.contactInformation.CellphoneNumber;
import com.deca.jelp.domain.customer.contactInformation.ContactInformation;
import com.deca.jelp.domain.customer.contactInformation.Email;
import com.deca.jelp.domain.customer.identificationCard.DateOfIssue;
import com.deca.jelp.domain.customer.identificationCard.ExpeditionPlace;
import com.deca.jelp.domain.customer.identificationCard.NumberId;
import com.deca.jelp.domain.customer.identificationCard.IdentificationCard;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerRequestDTO {

    @JsonProperty(value = "customer_id")
    private String customerId;
    @JsonProperty(value = "first_name")
    private String firstName;
    @JsonProperty(value = "second_name")
    private String secondName;
    @JsonProperty(value = "first_surname")
    private String firstSurname;
    @JsonProperty(value = "second_surname")
    private String secondSurname;
    @JsonProperty(value = "cellphone")
    private String cellphoneNumber;
    @JsonProperty(value = "id_number")
    private String idNumber;
    @JsonProperty(value = "date_of_issue")
    private String dateOfIssue;
    @JsonProperty(value = "expedition_place")
    private String expeditionPlace;
    @JsonProperty(value = "place_of_birth")
    private String placeOfBirth;
    private String address;
    private String email;
    @JsonProperty(value = "city_residence")
    private String cityResidence;


    public Customer toDomain(){
        return new Customer(
                new CustomerId(customerId),
                new ContactInformation(new CellphoneNumber(cellphoneNumber),new Address(address),new Email(email)),
                new Name(firstName,secondName,firstSurname,secondSurname),
                new IdentificationCard(new DateOfIssue(dateOfIssue),new ExpeditionPlace(expeditionPlace),new NumberId(idNumber)),
                new CityResidence(cityResidence)
                );
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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
