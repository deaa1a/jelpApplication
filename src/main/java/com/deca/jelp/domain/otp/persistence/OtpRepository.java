package com.deca.jelp.domain.otp.persistence;

import com.deca.jelp.domain.client.CellphoneNumber;
import com.deca.jelp.domain.client.IdNumber;
import com.deca.jelp.domain.client.Name;
import com.deca.jelp.domain.message.Message;
import com.deca.jelp.domain.otp.Otp;

public interface OtpRepository {
    void save(Name name, IdNumber idNumber, CellphoneNumber cellphoneNumber, Otp otp);
}
