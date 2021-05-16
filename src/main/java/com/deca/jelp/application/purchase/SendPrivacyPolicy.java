package com.deca.jelp.application.purchase;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.CustomerId;
import com.deca.jelp.domain.customer.persistence.CustomerRepository;
import com.deca.jelp.domain.message.Message;
import com.deca.jelp.domain.otp.PrivacyPolicy;
import com.deca.jelp.domain.otp.notification.service.SendMessage;
import com.deca.jelp.domain.otp.persistence.PrivacyPolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendPrivacyPolicy {

    private PrivacyPolicyRepository privacyPolicyRepository;
    private CustomerRepository customerRepository;
    private SendMessage sendMessage;

    @Autowired
    public SendPrivacyPolicy(PrivacyPolicyRepository privacyPolicyRepository, CustomerRepository customerRepository , SendMessage sendMessage){
        this.privacyPolicyRepository = privacyPolicyRepository;
        this.customerRepository = customerRepository;
        this.sendMessage = sendMessage;

    }

    public CustomerId Execute(Customer customer, PrivacyPolicy privacyPolicy){
        customerRepository.save(customer);
        privacyPolicyRepository.save(customer, privacyPolicy);
        sendMessage.send(new Message(privacyPolicy,customer.getName()));

        return customer.getCustomerId();
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
