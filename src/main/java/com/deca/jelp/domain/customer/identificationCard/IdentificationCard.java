package com.deca.jelp.domain.customer.identificationCard;

public class IdentificationCard {

    private DateOfIssue dateOfIssue;
    private ExpeditionPlace expeditionPlace;
    private NumberId numberId;


    public IdentificationCard(DateOfIssue dateOfIssue, ExpeditionPlace expeditionPlace, NumberId numberId) {
        this.dateOfIssue = dateOfIssue;
        this.expeditionPlace = expeditionPlace;
        this.numberId = numberId;
    }

    public IdentificationCard(NumberId numberId) {
        this.numberId = numberId;
    }

    public NumberId getIdNumber() {
        return numberId;
    }
}
