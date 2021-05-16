package com.deca.jelp.adapters.acceptance.persistence.dao;

import com.deca.jelp.adapters.acceptance.persistence.hibernate.record.PrivacyPolicyRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;
import java.util.List;

@Repository
public interface PrivacyPolicyDAO extends JpaRepository <PrivacyPolicyRecord, String> {


    /*@Query(
            "UPDATE PrivacyPolicyRecord SET updateDate = : updateDate, accepted = :accepted WHERE customerId = :customerId")*/
    PrivacyPolicyRecord updateByCustomerId(
            @Param("updateDate") ZonedDateTime updateDate,
            @Param("accepted") Boolean accepted,
            @Param("customerId") String customerId
    );

    List<PrivacyPolicyRecord> findByCustomerId (String customerId);
}
