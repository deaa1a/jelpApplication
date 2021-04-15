package com.deca.jelp.adapters.jewel.purchase;

import com.deca.jelp.domain.otp.Otp;
import com.deca.jelp.domain.otp.notification.service.SendMessage;
import org.springframework.stereotype.Service;

@Service
public class SendMessageAWS implements SendMessage {

    @Override
    public boolean send(Otp otp) {
        System.out.println("Sending OTP " + otp.getCode());
        return false;
    }
}
