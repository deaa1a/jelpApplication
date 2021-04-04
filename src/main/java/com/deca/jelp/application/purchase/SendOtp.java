package com.deca.jelp.application.purchase;

import com.deca.jelp.domain.client.Name;
import com.deca.jelp.domain.message.Message;
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

    public void Execute(Name name, IdNumber idNumber, CellphoneNumber cellphoneNumber, Otp otp){
        otpRepository.save(name,idNumber,cellphoneNumber,otp);
        sendMessage.send(otp);
    }


    /**
     * Delete me !!!
     * */
    public SendOtp(){}

    /**
     * Delete me !!!
     * */
    public int sumar(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

}
