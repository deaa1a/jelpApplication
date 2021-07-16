package com.deca.jelp.domain.customer.identificationCard;

public class NumberId {
    private String value;

    public NumberId(String value){
        this.value = value;
    }

    public boolean isEqualTo(String numberId){

        return this.value.equals(numberId);

        /*if(this.value == numberId){
            return value;
        }

        if(!(this.value == numberId)){
            throw new CustomException("The Number Id isn't same");
        }

        return value;*/
    }

    public String getValue() {
        return value;
    }
}