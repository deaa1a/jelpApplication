package com.deca.jelp.domain.otp.notification.service;

import com.deca.jelp.domain.otp.Otp;
import org.springframework.stereotype.Service;

public interface SendMessage {
    boolean send(Otp otp);
}
