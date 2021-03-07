package com.deca.jelp.domain.otp;

import java.util.Random;

public class Otp {
    private String code;


    public Otp(int sizeOtp) {
        this.code = generateCode(sizeOtp);
    }

    public Otp(String code){
        this.code = code;
    }

    private String generateCode(int sizeOtp) {
        return String.valueOf(new Random()
                .ints(1,calculateInitialRange(sizeOtp), calculateFinalRange(sizeOtp))
                .findFirst()
                .getAsInt());
    }

    private int calculateInitialRange(int size){
        return (int) Math.pow(10, size-1);
    }

    private int calculateFinalRange(int size){
        return (int) Math.pow(10,size) - 1;
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
