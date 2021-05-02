package com.deca.jelp.domain.customer;

import com.deca.jelp.domain.customer.contactInformation.ContactInformation;
import com.deca.jelp.domain.customer.identificationCard.IdentificationCard;

import java.util.UUID;

public class Customer {

    private CustomerId customerId;
    private ContactInformation contactInformation;
    private Name name;
    private IdentificationCard identificationCard;
    private CityResidence cityResidence;

    public Customer(Name name,ContactInformation contactInformation,  IdentificationCard identificationCard) {
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
}
