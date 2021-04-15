package com.deca.jelp.adapters.jewel.purchase;

import com.deca.jelp.domain.customer.CellphoneNumber;
import com.deca.jelp.domain.customer.IdNumber;
import com.deca.jelp.domain.customer.Name;
import com.deca.jelp.domain.otp.Otp;
import com.deca.jelp.domain.otp.persistence.OtpRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OtpMysqlRepository implements OtpRepository {

    @Override
    public void save(Name name, IdNumber idNumber, CellphoneNumber cellphoneNumber, Otp otp) {
        System.out.println("Save in DB "+ otp.getCode() +" - "+ cellphoneNumber.getValue());
    }
}
