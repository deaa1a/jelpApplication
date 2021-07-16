package com.deca.jelp.adapters.jewel.purchase.persistence.dao;

import com.deca.jelp.adapters.jewel.purchase.hibernate.record.JewelDataRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface JewelDataDAO extends JpaRepository<JewelDataRecord, String> {

}
