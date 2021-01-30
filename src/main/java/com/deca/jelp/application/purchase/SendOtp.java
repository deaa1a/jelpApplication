package com.deca.jelp.application.purchase;

import com.deca.jelp.domain.otp.Otp;
import com.deca.jelp.domain.client.CellphoneNumber;
import com.deca.jelp.domain.client.IdNumber;
import com.deca.jelp.domain.otp.notification.service.SendMessage;
import com.deca.jelp.domain.otp.persistence.OtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendOtp {

    private OtpRepository otpRepository;
    private SendMessage sendMessage;

    @Autowired
    public SendOtp(OtpRepository otpRepository, SendMessage sendMessage){
        this.otpRepository = otpRepository;
        this.sendMessage = sendMessage;
    }

    public void Execute(IdNumber idNumber, CellphoneNumber cellphoneNumber, Otp otp){
        otpRepository.save(idNumber,cellphoneNumber,otp);
        sendMessage.send(otp);
    }

}
