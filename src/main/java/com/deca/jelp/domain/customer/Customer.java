package com.deca.jelp.domain.customer;

import com.deca.jelp.domain.customer.contactInformation.ContactInformation;
import com.deca.jelp.domain.customer.identificationCard.IdentificationCard;
import com.deca.jelp.domain.otp.Otp;

public class Customer {

    private CustomerId customerId;
    private ContactInformation contactInformation;
    private Name name;
    private IdentificationCard identificationCard;
    private CityResidence cityResidence;
    private Otp otp;

    public Customer(Name name, ContactInformation contactInformation, IdentificationCard identificationCard) {
        this.customerId = new CustomerId();
        this.contactInformation = contactInformation;
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public Customer(CustomerId customerId, ContactInformation contactInformation, Name name, IdentificationCard identificationCard, CityResidence cityResidence) {
        this.customerId = customerId;
        this.contactInformation = contactInformation;
        this.name = name;
        this.identificationCard = identificationCard;
        this.cityResidence = cityResidence;
    }

    public Customer( CustomerId customerId,Otp otp) {
        this.otp = otp;
        this.customerId = customerId;
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

    public Otp getOtp(){return otp;}

}
