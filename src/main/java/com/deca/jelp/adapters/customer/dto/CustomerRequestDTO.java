package com.deca.jelp.adapters.customer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerRequestDTO {

    @JsonProperty(value = "name")
    private String name;
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


    public CustomerRequestDTO(String name, String cellphoneNumber, String idNumber, String dateOfIssue, String expeditionPlace, String placeOfBirth){
        this.name = name;
        this.cellphoneNumber = cellphoneNumber;
        this.idNumber = idNumber;
        this.dateOfIssue = dateOfIssue;
        this.expeditionPlace = expeditionPlace;
        this.placeOfBirth = placeOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setNames(String names)   {
        this.name = names;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphone) {
        this.cellphoneNumber = cellphone;
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

    public void setExpeditionPlace(String cityResidenceCard) {
        this.expeditionPlace = cityResidenceCard;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }


}
