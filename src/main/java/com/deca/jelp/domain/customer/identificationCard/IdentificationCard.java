package com.deca.jelp.domain.customer.identificationCard;

public class IdentificationCard {

    private DateOfIssue dateOfIssue;
    private ExpeditionPlace expeditionPlace;
    private NumberId numberId;
    private PlaceOfBirth placeOfBirth;



    public IdentificationCard(DateOfIssue dateOfIssue, ExpeditionPlace expeditionPlace, NumberId numberId, PlaceOfBirth placeOfBirth) {
        this.dateOfIssue = dateOfIssue;
        this.expeditionPlace = expeditionPlace;
        this.numberId = numberId;
        this.placeOfBirth = placeOfBirth;
    }

    public IdentificationCard(DateOfIssue dateOfIssue, ExpeditionPlace expeditionPlace, PlaceOfBirth placeOfBirth){
        this.dateOfIssue = dateOfIssue;
        this.expeditionPlace = expeditionPlace;
        this.placeOfBirth = placeOfBirth;
    }

    public IdentificationCard(NumberId numberId) {
        this.numberId = numberId;
    }



    public NumberId getIdNumber() {
        return numberId;
    }

    public DateOfIssue getDateOfIssue() {
        return dateOfIssue;
    }

    public ExpeditionPlace getExpeditionPlace() {
        return expeditionPlace;
    }

    public PlaceOfBirth getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setDateOfIssue(DateOfIssue dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public void setExpeditionPlace(ExpeditionPlace expeditionPlace) {
        this.expeditionPlace = expeditionPlace;
    }

    public void setNumberId(NumberId numberId) {
        this.numberId = numberId;
    }

    public void setPlaceOfBirth(PlaceOfBirth placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
