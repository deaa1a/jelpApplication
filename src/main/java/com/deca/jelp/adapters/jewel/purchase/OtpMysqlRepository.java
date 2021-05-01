package com.deca.jelp.adapters.jewel.purchase;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.otp.Otp;
import com.deca.jelp.domain.otp.persistence.OtpRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class OtpMysqlRepository implements OtpRepository {

    @Override
    public void save(Customer customer, Otp otp) {
        System.out.println("Save in DB "+ otp.getCode() +" - "+ customer.getContactInformation().getCellphoneNumbers().get(0));
    }

}
