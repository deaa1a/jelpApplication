package com.deca.jelp.domain.otp.persistence;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.otp.Otp;

public interface OtpRepository {
    void save(Customer customer, Otp otp);
}
