package com.deca.jelp.adapters.acceptance.persistence;

import com.deca.jelp.adapters.acceptance.persistence.dao.PrivacyPolicyDAO;
import com.deca.jelp.adapters.acceptance.persistence.hibernate.record.PrivacyPolicyRecord;
import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.CustomerId;
import com.deca.jelp.domain.otp.PrivacyPolicy;
import com.deca.jelp.domain.otp.persistence.PrivacyPolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PrivacyPolicyMysqlRepository implements PrivacyPolicyRepository {

    private PrivacyPolicyDAO privacyPolicyDAO;

    @Autowired
    public PrivacyPolicyMysqlRepository(PrivacyPolicyDAO privacyPolicyDAO) {
        this.privacyPolicyDAO = privacyPolicyDAO;
    }

    @Override
    public void save(Customer customer, PrivacyPolicy privacyPolicy) {
        privacyPolicyDAO.save(PrivacyPolicyRecord.from(customer, privacyPolicy));
    }

   /* @Override
    public List<PrivacyPolicy> getOtps(CustomerId customerId) {
        return privacyPolicyDAO.findByCustomerId(customerId.getValue())
                .stream().map(PrivacyPolicyRecord::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void updatePrivacyPolicy(PrivacyPolicy privacyPolicy,CustomerId customerId) {
        privacyPolicyDAO.updateByCustomerId(privacyPolicy.getUpdateDate(),privacyPolicy.getAccepted(),customerId.getValue());
    }*/


}
