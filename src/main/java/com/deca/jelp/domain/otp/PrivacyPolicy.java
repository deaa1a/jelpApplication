package com.deca.jelp.domain.otp;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;

public class PrivacyPolicy {

    private String code;
    private Boolean accepted;
    private ZonedDateTime createDate;
    private ZonedDateTime updateDate;
    private static final int VALIDATE_TIME_IN_SECONDS_CODE = 300;


    public PrivacyPolicy(int lenghtOtp) {
        this.code = generateCode(lenghtOtp);
        this.accepted = false;
        this.createDate = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/Bogota"));
    }

    public PrivacyPolicy(String code){
        this.code = code;
    }

    public PrivacyPolicy(String code, ZonedDateTime updateDate) {
        this.code = code;
        this.updateDate = updateDate;
    }

    public PrivacyPolicy(String code, Boolean accepted, ZonedDateTime createDate, ZonedDateTime updateDate) {
        this.code = code;
        this.accepted = accepted;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Boolean isEqualTo(String codeInput){
        return this.code.equals(codeInput);
    }

    public Boolean isValidCode(ZonedDateTime acceptanceDate){

        var timeOtp = acceptanceDate.toEpochSecond() - this.createDate.toEpochSecond();

        return timeOtp <= VALIDATE_TIME_IN_SECONDS_CODE;
    }

    private String generateCode(int lenghtOtp) {
        return String.valueOf(new Random()
                .ints(1,calculateInitialRange(lenghtOtp), calculateFinalRange(lenghtOtp))
                .findFirst()
                .getAsInt());
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public ZonedDateTime getCreateDate() {
        return createDate;
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

    public ZonedDateTime getUpdateDate() {
        return updateDate;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public void setUpdateDate(ZonedDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
