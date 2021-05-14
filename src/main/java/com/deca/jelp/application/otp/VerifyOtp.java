package com.deca.jelp.application.otp;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.otp.persistence.PrivacyPolicyAcceptanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyOtp {

    private PrivacyPolicyAcceptanceRepository privacyPolicyAcceptRepository;

    @Autowired
    public VerifyOtp(PrivacyPolicyAcceptanceRepository privacyPolicyAcceptRepository){
        this.privacyPolicyAcceptRepository = privacyPolicyAcceptRepository;
    }

    public void Execute(Customer customer){
        privacyPolicyAcceptRepository.getOtps(customer);
    }
}
