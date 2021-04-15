package com.deca.jelp.adapters.customer.persistence;

import com.deca.jelp.domain.RegisterClient.persitence.CustomerRepository;
import com.deca.jelp.domain.customer.*;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerMySqlRepository implements CustomerRepository {
    @Override
    public void save(Name name, CellphoneNumber cellphoneNumber, IdNumber idNumber, DateOfIssue dateOfIssue, ExpeditionPlace expeditionPlace, CityResidence cityResidence) {
        System.out.println("Save in DB " + name.getFirstName() + " " + name.getSecondName()+ " " + name.getFirstSurname() + " " + name.getSecondSurname() + " " + cellphoneNumber.getValue() + " " + idNumber.getValue() + " " + dateOfIssue.getValue() + " " + expeditionPlace.getValue() + " " + cityResidence.getValue());
    }
}
