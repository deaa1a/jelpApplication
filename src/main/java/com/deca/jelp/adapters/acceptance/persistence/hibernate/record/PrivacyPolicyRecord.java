package com.deca.jelp.adapters.acceptance.persistence.hibernate.record;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.otp.PrivacyPolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity
@Table(name= "privacy_policy", schema = "Jelp")
public class PrivacyPolicyRecord {

    @Id
    @Column(name = "customer_id")
    private String customerId;
    private String otp;

    @Column(name = "create_date")
    private ZonedDateTime createDate;

    @Column(name = "update_date")
    private ZonedDateTime updateDate;

    private Boolean accepted;

    public PrivacyPolicy toDomain(){
        return new PrivacyPolicy(otp, accepted, createDate, updateDate);
    }

    public static PrivacyPolicyRecord from(Customer customer, PrivacyPolicy privacyPolicy){
        PrivacyPolicyRecord record = new PrivacyPolicyRecord();

        record.setCustomerId(customer.getCustomerId().getValue());
        record.setOtp(privacyPolicy.getCode());
        record.setCreateDate(privacyPolicy.getCreateDate());
        record.setAccepted(privacyPolicy.getAccepted());

        return record;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public ZonedDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(ZonedDateTime createDate) {
        this.createDate = createDate;
    }

    public ZonedDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(ZonedDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }


}
