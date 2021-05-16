package com.deca.jelp.domain.exceptions;

public class WrongOtpException extends Exception{
    String code;

    public WrongOtpException() {
        super("wrong Otp");
        this.code = "1-001";
    }
}
