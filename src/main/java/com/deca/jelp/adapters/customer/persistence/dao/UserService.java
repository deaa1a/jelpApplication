package com.deca.jelp.adapters.customer.persistence.dao;

import com.deca.jelp.adapters.customer.persistence.hibernate.record.CustomerRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {

    Iterable<CustomerRecord> findAll();
    Page<CustomerRecord> findAll(Pageable pageable);
    Optional<CustomerRecord> findBy(Long id);
    CustomerRecord save(CustomerRecord customerRecord);
    void deleteById(Long id);

}
