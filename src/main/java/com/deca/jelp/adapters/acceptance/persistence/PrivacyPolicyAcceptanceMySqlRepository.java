package com.deca.jelp.adapters.acceptance.persistence;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.otp.persistence.PrivacyPolicyAcceptanceRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PrivacyPolicyAcceptanceMySqlRepository implements PrivacyPolicyAcceptanceRepository {


    @Override
    public void getOtps(Customer customer) {
        System.out.println("Testing " + customer.getCustomerId().getValue() + " " + customer.getOtp().getCode());
    }


}
