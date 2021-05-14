package com.deca.jelp.domain.otp.persistence;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.CustomerId;
import com.deca.jelp.domain.otp.Otp;

public interface PrivacyPolicyAcceptanceRepository {
    void getOtps(Customer customer);

}

