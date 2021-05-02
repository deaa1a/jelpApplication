package com.deca.jelp.adapters.customer.persistence.hibernate.record;

import javax.persistence.*;

@Entity
@Table(name = "Customer", schema = "Jelp")
public class CustomerRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identification_id")
    private String identificationId;


    public Long getCustomerId (){
        return id;
    }

    public void setCustomerId (Long customerId){
        this.id = customerId;
    }

    public String getIdentificationId () {
        return identificationId;
    }

    public void setIdentificationId (String identificationId) {
        this.identificationId = identificationId;
    }


}
