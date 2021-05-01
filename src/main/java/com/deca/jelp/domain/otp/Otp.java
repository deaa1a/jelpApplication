package com.deca.jelp.domain.otp;

import java.util.Random;

public class Otp {
    private String code;


    public Otp(int lenghtOtp) {
        this.code = generateCode(lenghtOtp);
    }

    public Otp(String code){
        this.code = code;
    }

    private String generateCode(int lenghtOtp) {
        return String.valueOf(new Random()
                .ints(1,calculateInitialRange(lenghtOtp), calculateFinalRange(lenghtOtp))
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
        return this.code.equals(recoveryOtp);
    }

    public String getCode() {
        return code;
    }
}
