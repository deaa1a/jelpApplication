package com.deca.jelp.adapters.acceptance.persistence;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.otp.Otp;
import com.deca.jelp.domain.otp.persistence.OtpRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OtpMysqlRepository implements OtpRepository {

    @Override
    public void save(Customer customer, Otp otp) {
        System.out.println("Save in DB "+ otp.getCode() +" - "+ customer.getContactInformation().getCellphoneNumber().getValue());
    }

}
