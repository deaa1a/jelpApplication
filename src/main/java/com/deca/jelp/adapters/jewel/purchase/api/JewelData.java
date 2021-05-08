package com.deca.jelp.adapters.jewel.purchase.api;

import com.deca.jelp.adapters.jewel.purchase.dto.JewelRequestDTO;
import com.deca.jelp.application.jewel.SaveJewel;
import com.deca.jelp.domain.jewel.jewerlyData.CaratsJewel;
import com.deca.jelp.domain.jewel.jewerlyData.MaterialJewel;
import com.deca.jelp.domain.jewel.jewerlyData.TypeJewel;
import com.deca.jelp.domain.jewel.jewerlyData.WeightJewel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping(value = "jewel")
    public void jewelRecord(@RequestBody JewelRequestDTO request){
        saveJewel.Execute(request.toDomain());
    }

}
