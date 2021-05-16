package com.deca.jelp.adapters.acceptance.persistence;

import com.deca.jelp.adapters.acceptance.persistence.dao.PrivacyPolicyAcceptanceDAO;
import com.deca.jelp.adapters.acceptance.persistence.hibernate.record.PrivacyPolicyRecord;
import com.deca.jelp.domain.customer.CustomerId;
import com.deca.jelp.domain.otp.PrivacyPolicy;
import com.deca.jelp.domain.otp.persistence.PrivacyPolicyAcceptanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PrivacyPolicyAcceptanceMySqlRepository implements PrivacyPolicyAcceptanceRepository {

    PrivacyPolicyAcceptanceDAO privacyPolicyAcceptanceDAO;

    @Autowired
    public PrivacyPolicyAcceptanceMySqlRepository(PrivacyPolicyAcceptanceDAO privacyPolicyAcceptanceDAO) {
        this.privacyPolicyAcceptanceDAO = privacyPolicyAcceptanceDAO;
    }

    @Override
    public List<PrivacyPolicy> getOtps(CustomerId customerId) {
        return privacyPolicyAcceptanceDAO.findByCustomerId(customerId.getValue())
                .stream().map(PrivacyPolicyRecord::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void updatePrivacyPolicy(PrivacyPolicy privacyPolicy) {
        privacyPolicyAcceptanceDAO.updatePrivacyPolicy(privacyPolicy.getAccepted(),privacyPolicy.getUpdateDate());
    }


}
