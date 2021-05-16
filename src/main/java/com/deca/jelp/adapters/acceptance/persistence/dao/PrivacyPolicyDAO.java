package com.deca.jelp.adapters.acceptance.persistence.dao;

import com.deca.jelp.adapters.acceptance.persistence.hibernate.record.PrivacyPolicyRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZonedDateTime;
import java.util.List;

@Repository
public interface PrivacyPolicyDAO extends JpaRepository <PrivacyPolicyRecord, String> {
    @Transactional
    @Modifying
    @Query(
            "UPDATE PrivacyPolicyRecord pp SET pp.updateDate = :update_date, pp.accepted = :accepted WHERE pp.customerId = :customer_id")
    void updateByCustomerId(
            @Param("update_date") ZonedDateTime updateDate,
            @Param("accepted") Boolean accepted,
            @Param("customer_id") String customerId
    );

    List<PrivacyPolicyRecord> findByCustomerId (String customerId);
}
