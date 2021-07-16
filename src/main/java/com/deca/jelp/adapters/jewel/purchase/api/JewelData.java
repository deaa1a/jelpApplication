package com.deca.jelp.adapters.jewel.purchase.api;

import com.deca.jelp.adapters.jewel.purchase.dto.JewelRequestDTO;
import com.deca.jelp.application.jewel.SaveJewel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JewelData {

    private SaveJewel saveJewel;

    @Autowired
    public  JewelData(SaveJewel saveJewel){
        this.saveJewel = saveJewel;
    }

    @PostMapping(value = "/jewel")
    public void jewelRecord(@RequestBody JewelRequestDTO request){
        saveJewel.execute(request.toDomain());
    }

}
