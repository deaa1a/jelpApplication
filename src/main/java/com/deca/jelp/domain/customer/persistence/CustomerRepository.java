package com.deca.jelp.domain.customer.persistence;

import com.deca.jelp.domain.customer.*;

public interface CustomerRepository {
    void update(Customer customer);
    void save(Customer customer);
}
