package com.deca.jelp.adapters.customer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerRequestDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCustomer;

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


    public CustomerRequestDTO(String firstName, String secondName, String firstSurname, String secondSurname, String cellphoneNumber, String idNumber, String dateOfIssue, String expeditionPlace, String placeOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.cellphoneNumber = cellphoneNumber;
        this.idNumber = idNumber;
        this.dateOfIssue = dateOfIssue;
        this.expeditionPlace = expeditionPlace;
        this.placeOfBirth = placeOfBirth;
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
}
