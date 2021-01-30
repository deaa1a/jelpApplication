package com.deca.jelp.adapters.jewel.purchase.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InitClientDTO {

    @JsonProperty(value = "names")
    private String names;
    @JsonProperty(value = "sur_name")
    private String surName;
    @JsonProperty(value = "second_sur_name")
    private String secondSurName;
    @JsonProperty(value = "cellphone")
    private String cellphoneNumber;
    @JsonProperty(value = "id_number")
    private String idNumber;
    @JsonProperty(value = "city_residence_card")
    private String cityIdentityCard;
    @JsonProperty(value = "city_residence")
    private String cityResidence;

    public InitClientDTO(String names, String surName, String secondSurName, String cellphoneNumber, String idNumber, String cityIdentityCard, String cityResidence){
        this.names = names;
        this.surName = surName;
        this.secondSurName = secondSurName;
        this.cellphoneNumber = cellphoneNumber;
        this.idNumber = idNumber;
        this.cityIdentityCard = cityIdentityCard;
        this.cityResidence = cityResidence;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSecondSurName() {
        return secondSurName;
    }

    public void setSecondSurName(String secondSurName) {
        this.secondSurName = secondSurName;
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
