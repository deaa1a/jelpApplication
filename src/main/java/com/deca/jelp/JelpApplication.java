package com.deca.jelp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class JelpApplication {

    public static void main(String[] args) {
        SpringApplication.run(JelpApplication.class, args);
    }

}