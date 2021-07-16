package com.deca.jelp.domain.customer;

import com.deca.jelp.domain.customer.contactInformation.*;
import com.deca.jelp.domain.customer.identificationCard.*;
import com.deca.jelp.domain.otp.PrivacyPolicy;

public class Customer {

    private CustomerId customerId;
    private ContactInformation contactInformation;
    private Name name;
    private IdentificationCard identificationCard;
    private PrivacyPolicy privacyPolicy;

    public Customer(Name name, ContactInformation contactInformation, IdentificationCard identificationCard) {
        this.customerId = new CustomerId();
        this.contactInformation = contactInformation;
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public Customer(Name name,ContactInformation contactInformation, IdentificationCard identificationCard, CustomerId customerId) {
        this.customerId = customerId;
        this.contactInformation = contactInformation;
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public Customer(CustomerId customerId, PrivacyPolicy privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
        this.customerId = customerId;
    }

    public Customer(Name name, CustomerId customerId) {
        this.name = name;
        this.customerId= customerId;
    }

   


    public Name getName() {
        return name;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public IdentificationCard getIdentificationCard() {
        return identificationCard;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public PrivacyPolicy getOtp(){return privacyPolicy;}

}
