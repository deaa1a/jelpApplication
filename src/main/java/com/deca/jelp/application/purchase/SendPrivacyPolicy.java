package com.deca.jelp.application.purchase;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.persistence.CustomerRepository;
import com.deca.jelp.domain.message.Message;
import com.deca.jelp.domain.otp.Otp;
import com.deca.jelp.domain.otp.notification.service.SendMessage;
import com.deca.jelp.domain.otp.persistence.OtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendPrivacyPolicy {

    private OtpRepository otpRepository;
    private CustomerRepository customerRepository;
    private SendMessage sendMessage;

    @Autowired
    public SendPrivacyPolicy(OtpRepository otpRepository, CustomerRepository customerRepository , SendMessage sendMessage){
        this.otpRepository = otpRepository;
        this.customerRepository = customerRepository;
        this.sendMessage = sendMessage;

    }

    public void Execute(Customer customer, Otp otp){
        otpRepository.save(customer,otp);
        customerRepository.save(customer);
        sendMessage.send(new Message(otp,customer.getName()));
    }

    /**
     * Delete me !!!
     * */
    public SendPrivacyPolicy(){}

    /**
     * Delete me !!!
     * */
    public int sumar(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

}
