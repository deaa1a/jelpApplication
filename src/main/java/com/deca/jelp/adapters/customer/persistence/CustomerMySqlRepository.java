package com.deca.jelp.adapters.customer.persistence;

import com.deca.jelp.domain.customer.persistence.CustomerRepository;
import com.deca.jelp.domain.customer.*;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerMySqlRepository implements CustomerRepository {
    @Override
    public void update(Customer customer) {
        System.out.println("Update in DB " + customer.getName().getFirstName() + " " + customer.getName().getSecondName()+ " " + customer.getName().getFirstSurname() + " " + customer.getName().getSecondSurname() + " " + customer.getContactInformation().getCellphoneNumber().getValue() + " " +customer.getIdentificationCard().getIdNumber().getValue() );
    }

    @Override
    public void save(Customer customer) {

    }
}
