package com.deca.jelp.adapters.customer.persistence.dao;

import com.deca.jelp.adapters.customer.persistence.hibernate.record.CustomerRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CustomerDAO extends JpaRepository<CustomerRecord, String> {

    @Transactional
    @Modifying
    @Query(
            "UPDATE CustomerRecord cr " +
                    "SET cr.secondName = :second_name, " +
                    "cr.firstSurname = :first_surname, " +
                    "cr.secondSurname = :second_surname, " +
                    "cr.dateOfIssue = :date_of_issue, " +
                    "cr.expeditionPlace = :expedition_place, " +
                    "cr.placeOfBirth = :place_of_birth, " +
                    "cr.address = :address, " +
                    "cr.email = :email, " +
                    " cr.cityResidence = :city_residence " +
                    "WHERE cr.customerId = :customer_id"
    )
    void updateCustomerInformation(
            @Param("second_name") String secondName,
            @Param("first_surname") String firstSurname,
            @Param("second_surname") String secondSurname,
            @Param("date_of_issue") String dateOfIssue,
            @Param("expedition_place") String expeditionPlace,
            @Param("place_of_birth") String placeOfBirth,
            @Param("address") String address,
            @Param("email") String email,
             @Param("city_residence") String cityResidence,
            @Param("customer_id") String customerId
    );

    CustomerRecord findByCustomerId(String customerId);

}


