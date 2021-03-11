package com.deca.jelp.adapters.customer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerRequestDTO {

    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "cellphone")
    private String cellphoneNumber;
    @JsonProperty(value = "id_number")
    private String idNumber;
    @JsonProperty(value = "city_residence_card")
    private String cityIdentityCard;
    @JsonProperty(value = "city_residence")
    private String cityResidence;


    public CustomerRequestDTO(String name, String cellphoneNumber, String idNumber, String cityIdentityCard, String cityResidence){
        this.name = name;
        this.cellphoneNumber = cellphoneNumber;
        this.idNumber = idNumber;
        this.cityIdentityCard = cityIdentityCard;
        this.cityResidence = cityResidence;
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

    public String getCityIdentityCard() {
        return cityIdentityCard;
    }

    public void setCityIdentityCard(String cityResidenceCard) {
        this.cityIdentityCard = cityResidenceCard;
    }

    public String getCityResidence() {
        return cityResidence;
    }

    public void setCityResidence(String cityResidence) {
        this.cityResidence = cityResidence;
    }


}
