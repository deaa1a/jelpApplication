package com.deca.jelp.domain.otp;

import java.util.Optional;
import java.util.Random;

public class Otp {
    private String code;

    public Otp(int sizeCode){
        this.code = generateCode(sizeCode);
    }

    public Otp(String code){
        this.code = code;
    }

    private String generateCode(int sizeCode){
        //Implement algorithm
        return "4566";
    }

    private boolean isValid(String recoveryOtp){
        if(this.code.equals(recoveryOtp)){
            return true;
        }else {
            return false;
        }
    }

    public String getCode() {
        return code;
    }
}
