package com.deca.jelp.adapters.customer.persistence.dao;

import com.deca.jelp.adapters.customer.persistence.hibernate.record.CustomerRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends JpaRepository<CustomerRecord, String>{



}
