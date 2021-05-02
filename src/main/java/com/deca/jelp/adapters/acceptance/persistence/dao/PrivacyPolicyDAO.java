package com.deca.jelp.adapters.acceptance.persistence.dao;

import com.deca.jelp.adapters.acceptance.persistence.hibernate.record.PrivacyPolicyRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivacyPolicyDAO extends JpaRepository <PrivacyPolicyRecord, String> {
}
