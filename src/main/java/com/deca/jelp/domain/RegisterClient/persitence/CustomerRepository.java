package com.deca.jelp.domain.RegisterClient.persitence;

import com.deca.jelp.domain.client.*;

public interface CustomerRepository {
    void save(Name firstName, CellphoneNumber cellphoneNumber, IdNumber idNumber, DateOfIssue dateOfIssue, ExpeditionPlace expeditionPlace, CityResidence cityResidence);
}
