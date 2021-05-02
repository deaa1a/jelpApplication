package com.deca.jelp.adapters.customer.api;

import com.deca.jelp.adapters.customer.persistence.dao.UserService;
import com.deca.jelp.adapters.customer.persistence.hibernate.record.CustomerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping(path = "/api/users")
public class ConnectingDDBB {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CustomerRecord customerRecord){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(customerRecord));
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> read (@PathVariable Long id){
        Optional<CustomerRecord> User = userService.findBy(id);

        if (!User.isPresent()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(User);

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update (@RequestBody CustomerRecord customerDetails,@PathVariable Long id){
        Optional<CustomerRecord> user = userService.findBy(id);

        if(!user.isPresent()){
            return ResponseEntity.notFound().build();
        }

        user.get().setIdentificationId(customerDetails.getIdentificationId());

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user.get()));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete (@PathVariable Long id){

        if (!userService.findBy(id).isPresent()){
            return ResponseEntity.notFound().build();
        }

        userService.deleteById(id);
        return ResponseEntity.ok().build();

    }

    @GetMapping
    public List<CustomerRecord> readAll() {
        List<CustomerRecord> users = StreamSupport
                .stream(userService.findAll().spliterator(), false)
                .collect(Collectors.toList());

            return users;
    }

}
