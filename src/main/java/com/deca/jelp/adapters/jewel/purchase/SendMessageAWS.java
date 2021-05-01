package com.deca.jelp.adapters.jewel.purchase;

import com.deca.jelp.domain.message.Message;
import com.deca.jelp.domain.otp.Otp;
import com.deca.jelp.domain.otp.notification.service.SendMessage;
import org.springframework.stereotype.Service;

@Service
public class SendMessageAWS implements SendMessage {

    @Override
    public boolean send(Message message) {
        System.out.println(message);
        return false;
    }
}
