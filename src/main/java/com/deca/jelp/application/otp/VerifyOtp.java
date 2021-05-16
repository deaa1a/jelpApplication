package com.deca.jelp.application.otp;

import com.deca.jelp.domain.customer.CustomerId;
import com.deca.jelp.domain.otp.PrivacyPolicy;
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

    public void Execute(CustomerId customerId, PrivacyPolicy privacyPolicyInput) throws Exception {
       var privacyPolicies = privacyPolicyAcceptRepository.getOtps(customerId);
       var privacyPolicyFound =privacyPolicies.stream()
               .filter(privacyPolicyResult -> privacyPolicyResult.isEqualTo(privacyPolicyInput.getCode()))
               .findFirst();

       if (privacyPolicyFound.isPresent()){
            if (privacyPolicyFound.get().isValidCode(privacyPolicyInput.getUpdateDate())){
                    privacyPolicyFound.get().setAccepted(true);
                    privacyPolicyFound.get().setUpdateDate(privacyPolicyInput.getUpdateDate());
                    privacyPolicyAcceptRepository.updatePrivacyPolicy(privacyPolicyFound.get());
            }else {
                throw new Exception("Otp isn't valid");
            }

       }else {
           throw new Exception("Otp wrong");
       }

       }
    }

