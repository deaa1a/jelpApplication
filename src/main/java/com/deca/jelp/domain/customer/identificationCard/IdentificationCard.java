package com.deca.jelp.domain.customer.identificationCard;

public class IdentificationCard {

    private DateOfIssue dateOfIssue;
    private ExpeditionPlace expeditionPlace;
    private IdNumber idNumber;


    public IdentificationCard(DateOfIssue dateOfIssue, ExpeditionPlace expeditionPlace, IdNumber idNumber) {
        this.dateOfIssue = dateOfIssue;
        this.expeditionPlace = expeditionPlace;
        this.idNumber = idNumber;
    }

    public IdentificationCard(IdNumber idNumber) {
        this.idNumber = idNumber;
    }

    public IdNumber getIdNumber() {
        return idNumber;
    }
}
