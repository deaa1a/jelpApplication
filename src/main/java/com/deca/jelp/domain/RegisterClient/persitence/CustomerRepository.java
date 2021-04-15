package com.deca.jelp.domain.RegisterClient.persitence;

import com.deca.jelp.domain.customer.*;

public interface CustomerRepository {
    void save(Name firstName, CellphoneNumber cellphoneNumber, IdNumber idNumber, DateOfIssue dateOfIssue, ExpeditionPlace expeditionPlace, CityResidence cityResidence);
}
