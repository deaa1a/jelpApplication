package com.deca.jelp.application.customer;

import com.deca.jelp.domain.customer.Customer;
import com.deca.jelp.domain.customer.persistence.CustomerRepository;
import com.deca.jelp.domain.exceptions.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FillCustomerInformation {

    private CustomerRepository customerRepository;

    @Autowired
    public FillCustomerInformation(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public void execute(Customer customerInput) throws Exception{
        var customerRecovery = customerRepository.getData(customerInput.getCustomerId());
        if(customerRecovery != null){
            customerRepository.update(customerInput);
        }else{
            throw new CustomerNotFoundException();
        }
    }



 /*try {
            customer.getName().isEqualTo(customer.getName().getFirstName());
        }catch (CustomException e) {
            System.out.println("No se pudo registrar el nombre debido a: " + e.getMessage());
        }

        try {
            customer.getContactInformation().getCellphoneNumber().isEqualTo(customer.getContactInformation().getCellphoneNumber().getValue());
        }catch (CustomException e) {
            System.out.println("No se pudo registrar el numero de celular debido a: " + e.getMessage());
        }

        try {
            customer.getIdentificationCard().getIdNumber().isEqualTo(customer.getIdentificationCard().getIdNumber().getValue());
        }catch (CustomException e){
            System.out.println("No se pudo registrar la cedula de ciudadania debido a: " + e.getMessage() );
        }*/






    }


