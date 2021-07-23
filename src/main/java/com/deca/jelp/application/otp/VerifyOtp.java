package com.deca.jelp.application.otp;

import com.deca.jelp.domain.customer.CustomerId;
import com.deca.jelp.domain.exceptions.InvalidOtpException;
import com.deca.jelp.domain.exceptions.WrongOtpException;
import com.deca.jelp.domain.otp.PrivacyPolicy;
import com.deca.jelp.domain.otp.persistence.PrivacyPolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VerifyOtp {

    private PrivacyPolicyRepository privacyPolicyRepository;

    @Autowired
    public VerifyOtp(PrivacyPolicyRepository privacyPolicyRepository){
        this.privacyPolicyRepository = privacyPolicyRepository;
    }

    public void Execute(CustomerId customerId, PrivacyPolicy privacyPolicyInput) throws Exception {
       var privacyPolicies = privacyPolicyRepository.getOtps(customerId);
           var privacyPolicyFound =privacyPolicies.stream()
                   .filter(privacyPolicyResult -> privacyPolicyResult.isEqualTo(privacyPolicyInput.getCode()))
                   .findFirst();

       if (privacyPolicyFound.isPresent()){
            if (privacyPolicyFound.get().isValidCode(privacyPolicyInput.getUpdateDate())){
                    privacyPolicyFound.get().setAccepted(true);
                    privacyPolicyFound.get().setUpdateDate(privacyPolicyInput.getUpdateDate());
                privacyPolicyRepository.updatePrivacyPolicy(privacyPolicyFound.get(),customerId);
            } else {
                throw new InvalidOtpException();
            }

       }else {
           throw new WrongOtpException();
       }

       }
    }