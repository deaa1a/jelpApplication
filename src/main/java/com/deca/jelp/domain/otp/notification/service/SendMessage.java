package com.deca.jelp.domain.otp.notification.service;

import com.deca.jelp.domain.message.Message;

public interface SendMessage {
    boolean send(Message message);
}
