package com.deca.jelp.adapters.acceptance.dto;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.CustomerId;
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


    public Customer toDomain(){
        return new Customer(
                new Name(firstName),
                new ContactInformation(new CellphoneNumber(cellphoneNumber)),
                new IdentificationCard(new NumberId(numberId))

                );

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

}
