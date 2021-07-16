package com.deca.jelp.domain.customer.contactInformation;

public class CellphoneNumber {
    private String value;

    public CellphoneNumber(String value){
        this.value = value;
    }

    /*public String isEqualTo(String cellphoneNumber) throws CustomException {
        if (this.value == cellphoneNumber){
            return value;
        }

        if (!(this.value == cellphoneNumber)){
            throw new CustomException("The cellphone is not the same");
        }

        return value;
    }*/

    public String getValue() {
        return value;
    }

}
