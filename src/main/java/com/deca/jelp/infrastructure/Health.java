package com.deca.jelp.infrastructure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {

    @GetMapping(value = "/ping")
    public String health(){
        return "pong";
    }
}



