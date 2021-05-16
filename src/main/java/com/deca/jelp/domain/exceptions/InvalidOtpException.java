package com.deca.jelp.domain.exceptions;

public class InvalidOtpException extends Exception{
    String code;
    public InvalidOtpException() {
        super("Invalid Otp");
        this.code = "1-002";
    }
}
