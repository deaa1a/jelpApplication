package com.deca.jelp.adapters.acceptance.dto;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.Name;
import com.deca.jelp.domain.customer.contactInformation.CellphoneNumber;
import com.deca.jelp.domain.customer.contactInformation.ContactInformation;
import com.deca.jelp.domain.customer.identificationCard.IdentificationCard;
import com.deca.jelp.domain.customer.identificationCard.NumberId;
import com.deca.jelp.domain.otp.Otp;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PrivacyPolicyRequestDTO {

    @JsonProperty(value = "first_name")
    private String firstName;
    @JsonProperty(value = "id_number")
    private String numberId;
    @JsonProperty(value = "cellphone")
    private String cellphoneNumber;

    public PrivacyPolicyRequestDTO(String firstName, String numberId, String cellphoneNumber) {
        this.firstName = firstName;
        this.numberId = numberId;
        this.cellphoneNumber = cellphoneNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getNumberId() {
        return numberId;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }
}
