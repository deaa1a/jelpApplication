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

    @Transactional
    @Modifying
    @Query(
            "UPDATE JewelDataRecord jd SET " +
                    "jd.typeJewel = :type_jewel, " +
                    "jd.caratsJewel = :carats_jewel," +
                    " jd.weightJewel = :weight_jewel," +
                    " jd.materialJewel = :material_jewel " +
                    "WHERE jd.customerId = :customer_id"
    )
    void saveJewelDataOfCustomer(
            @Param("type_jewel") String typeJewel,
            @Param("carats_jewel") String caratsJewel,
            @Param("weight_jewel") String weightJewel,
            @Param("material_jewel ") String materialJewel
    );


}
