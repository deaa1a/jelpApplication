package com.deca.jelp.domain.customer.persistence;

import com.deca.jelp.adapters.customer.persistence.hibernate.record.CustomerRecord;
import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.CustomerId;

public interface CustomerRepository {
    CustomerRecord getData(CustomerId customerId);
    void update(Customer customer);
    void save(Customer customer);

}
