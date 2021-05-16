package com.deca.jelp.domain.otp.persistence;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.otp.PrivacyPolicy;

public interface PrivacyPolicyRepository {
    void save(Customer customer, PrivacyPolicy privacyPolicy);
}
