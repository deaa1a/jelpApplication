package com.deca.jelp.adapters.customer.persistence.hibernate.record;

import com.deca.jelp.domain.customer.Customer;

import javax.persistence.*;

@Entity
@Table(name = "Customer", schema = "Jelp")
public class CustomerRecord {

    @Id
    @Column(name = "customer_id")
    private String customerId;

    private String name;

    @Column(name = "number_id")
    private String numberId;

    @Column(name = "cellphone_number")
    private String cellphoneNumber;

    public static CustomerRecord from(Customer customer){
        CustomerRecord record = new CustomerRecord();

        record.setCustomerId(customer.getCustomerId().getValue());
        record.setName(customer.getName().getFirstName());
        record.setNumberId(customer.getIdentificationCard().getIdNumber().getValue());
        record.setCellphoneNumber(customer.getContactInformation().getCellphoneNumber().getValue());

        return record;
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }




}
