package com.deca.jelp.domain.otp.persistence;

import com.deca.jelp.domain.client.CellphoneNumber;
import com.deca.jelp.domain.client.IdNumber;
import com.deca.jelp.domain.otp.Otp;
import org.springframework.stereotype.Repository;

public interface OtpRepository {
    void save(IdNumber idNumber, CellphoneNumber cellphoneNumber, Otp otp);
}
