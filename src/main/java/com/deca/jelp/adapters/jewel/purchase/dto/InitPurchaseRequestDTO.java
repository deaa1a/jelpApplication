package com.deca.jelp.adapters.jewel.purchase.dto;

import com.deca.jelp.adapters.jewel.purchase.api.InitPurchase;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(as = InitPurchaseRequestDTO.class)
@JsonDeserialize(as = InitPurchaseRequestDTO.class)
public class InitPurchaseRequestDTO {

    private String idNumber;
    private String cellPhoneNumber;

    public InitPurchaseRequestDTO(String idNumber,String cellPhoneNumber){
        this.idNumber = idNumber;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }
}
