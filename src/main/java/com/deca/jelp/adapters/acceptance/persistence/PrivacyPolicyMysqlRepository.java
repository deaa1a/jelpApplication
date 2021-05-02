package com.deca.jelp.adapters.acceptance.persistence;

import com.deca.jelp.adapters.acceptance.persistence.dao.PrivacyPolicyDAO;
import com.deca.jelp.adapters.acceptance.persistence.hibernate.record.PrivacyPolicyRecord;
import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.otp.Otp;
import com.deca.jelp.domain.otp.persistence.PrivacyPolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PrivacyPolicyMysqlRepository implements PrivacyPolicyRepository {

    private PrivacyPolicyDAO privacyPolicyDAO;

    @Autowired
    public PrivacyPolicyMysqlRepository(PrivacyPolicyDAO privacyPolicyDAO) {
        this.privacyPolicyDAO = privacyPolicyDAO;
    }

    @Override
    public void save(Customer customer, Otp otp) {
        privacyPolicyDAO.save(PrivacyPolicyRecord.from(customer, otp));
    }

}
