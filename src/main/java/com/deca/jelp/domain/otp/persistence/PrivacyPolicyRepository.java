package com.deca.jelp.domain.otp.persistence;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.CustomerId;
import com.deca.jelp.domain.otp.PrivacyPolicy;

import java.util.List;


public interface PrivacyPolicyRepository {
    void save(Customer customer, PrivacyPolicy privacyPolicy);
    List<PrivacyPolicy> getOtps(CustomerId customerId);
    void updatePrivacyPolicy(PrivacyPolicy privacyPolicy, CustomerId customerId);}
