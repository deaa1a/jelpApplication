package com.deca.jelp.adapters.jewel.purchase.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtpRequestDTO {

    @JsonProperty(value = "name")
    private String name;
    private String idNumber;
    private String cellphoneNumber;

    public OtpRequestDTO(String name, String idNumber, String cellphoneNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }
}
