package com.deca.jelp.adapters.acceptance.api;

import com.deca.jelp.adapters.acceptance.dto.PrivacyPolicyAcceptanceDTO;
import com.deca.jelp.application.otp.VerifyOtp;
import com.deca.jelp.domain.customer.CustomerId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivacyPolicyAcceptance {

    private VerifyOtp verifyOtp;

    @Autowired
    public PrivacyPolicyAcceptance(VerifyOtp verifyOtp){
        this.verifyOtp = verifyOtp;
    }

    @PostMapping(value = "/privacy-policy/acceptance")
    public void verifyOtp (@RequestBody PrivacyPolicyAcceptanceDTO request) throws Exception {
        verifyOtp.Execute(new CustomerId(request.getCustomerId()),request.toPrivacyPolicyDomain());
    }
}
