package com.deca.jelp.adapters.jewel.purchase.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InitPurchaseRequestDTO {

    @JsonProperty(value = "id_number")
    private String idNumber;
    @JsonProperty(value = "cellphone_number")
    private String cellphoneNumber;

    public InitPurchaseRequestDTO(String idNumber,String cellphoneNumber){
        this.idNumber = idNumber;
        this.cellphoneNumber = cellphoneNumber;
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
