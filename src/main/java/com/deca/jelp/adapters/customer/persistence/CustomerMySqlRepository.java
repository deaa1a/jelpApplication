package com.deca.jelp.adapters.customer.persistence;

import com.deca.jelp.adapters.customer.persistence.dao.CustomerDAO;
import com.deca.jelp.adapters.customer.persistence.hibernate.record.CustomerRecord;
import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.CustomerId;
import com.deca.jelp.domain.customer.persistence.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerMySqlRepository implements CustomerRepository {

    private CustomerDAO customerDAO;

    @Autowired
    public CustomerMySqlRepository(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }


    @Override
    public CustomerRecord getData(CustomerId customerId) {
        return  customerDAO.findByCustomerId(customerId.getValue());
    }

    @Override
    public void update(Customer customer) {
        customerDAO.updateCustomerInformation(
                customer.getName().getSecondName(),
                customer.getName().getFirstSurname(),
                customer.getName().getSecondSurname(),
                customer.getIdentificationCard().getDateOfIssue().getValue(),
                customer.getIdentificationCard().getExpeditionPlace().getValue(),
                customer.getIdentificationCard().getPlaceOfBirth().getValue(),
                customer.getContactInformation().getAddress().getValue(),
                customer.getContactInformation().getEmail().getValue(),
                customer.getContactInformation().getCityResidence().getValue(),
                customer.getCustomerId().getValue());
    }

    @Override
    public void save(Customer customer) {
        customerDAO.save(CustomerRecord.from(customer));
    }
}
