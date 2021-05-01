package com.deca.jelp.domain.customer.persistence;

import com.deca.jelp.domain.customer.*;
import com.deca.jelp.domain.customer.identificationCard.DateOfIssue;
import com.deca.jelp.domain.customer.identificationCard.ExpeditionPlace;
import com.deca.jelp.domain.customer.identificationCard.IdNumber;

public interface CustomerRepository {
    void update(Name name, CellphoneNumber cellphoneNumber, IdNumber idNumber, DateOfIssue dateOfIssue, ExpeditionPlace expeditionPlace, CityResidence cityResidence);
    void save(Customer customer);
}
