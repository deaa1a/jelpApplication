package com.deca.jelp.domain.otp.persistence;

import com.deca.jelp.domain.customer.CellphoneNumber;
import com.deca.jelp.domain.customer.IdNumber;
import com.deca.jelp.domain.customer.Name;
import com.deca.jelp.domain.otp.Otp;

public interface OtpRepository {
    void save(Name name, IdNumber idNumber, CellphoneNumber cellphoneNumber, Otp otp);
}
