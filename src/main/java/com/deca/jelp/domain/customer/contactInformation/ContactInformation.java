package com.deca.jelp.domain.customer.contactInformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ContactInformation {

    private List<CellphoneNumber> cellphoneNumbers;
    private List<Address> addresses;
    private Email email;

    public ContactInformation(List<CellphoneNumber> cellphoneNumbers, List<Address> addresses, Email email) {
        this.cellphoneNumbers = cellphoneNumbers;
        this.addresses = addresses;
        this.email = email;
    }

    public ContactInformation(CellphoneNumber cellphoneNumber){
        this.cellphoneNumbers = new ArrayList<>(Collections.singletonList(cellphoneNumber));
    }

    public List<CellphoneNumber> getCellphoneNumbers() {
        return cellphoneNumbers;
    }
}
