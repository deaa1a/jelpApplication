package com.deca.jelp.adapters.customer.persistence.dao;

import com.deca.jelp.adapters.customer.persistence.hibernate.record.CustomerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional(readOnly = true)
    public Iterable<CustomerRecord> findAll() {
        return customerDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<CustomerRecord> findAll(Pageable pageable) {
        return customerDAO.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CustomerRecord> findBy(Long id) {
        return customerDAO.findById(id.toString());
    }

    @Override
    @Transactional
    public CustomerRecord save(CustomerRecord customerRecord) {
        return customerDAO.save(customerRecord);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        customerDAO.deleteById(id.toString());
    }
}
