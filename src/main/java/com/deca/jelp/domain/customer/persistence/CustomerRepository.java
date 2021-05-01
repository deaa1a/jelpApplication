package com.deca.jelp.domain.customer.persistence;

import com.deca.jelp.domain.customer.*;
import com.deca.jelp.domain.customer.identificationCard.DateOfIssue;
import com.deca.jelp.domain.customer.identificationCard.ExpeditionPlace;
import com.deca.jelp.domain.customer.identificationCard.IdNumber;

public interface CustomerRepository {
    void update(Customer customer);
    void save(Customer customer);
}
