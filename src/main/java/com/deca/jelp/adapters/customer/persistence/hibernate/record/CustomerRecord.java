package com.deca.jelp.adapters.customer.persistence.hibernate.record;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer", schema = "Jelp")
public class CustomerRecord {

    @Id
    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "identification_id")
    private String identificationId;


    public String getCustomerId (){
        return customerId;
    }

    public void setCustomerId (String customerId){
        this.customerId = customerId;
    }

    public String getIdentificationId () {
        return identificationId;
    }

    public void setIdentificationId (String identificationId) {
        this.identificationId = identificationId;
    }


}
