package com.deca.jelp.adapters.jewel.purchase.api;

import com.deca.jelp.adapters.jewel.purchase.dto.JewelRequestDTO;
import com.deca.jelp.application.jewel.SaveJewel;
import com.deca.jelp.domain.jewel.CaratsJewel;
import com.deca.jelp.domain.jewel.MaterialJewel;
import com.deca.jelp.domain.jewel.TypeJewel;
import com.deca.jelp.domain.jewel.WeightJewel;
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

    @PostMapping(value = "jewel")
    public void jewelRecord(@RequestBody JewelRequestDTO request){
        saveJewel.Execute(
                new TypeJewel(request.getTypeJewel()),
                new CaratsJewel(request.getCaratsJewel()),
                new WeightJewel(request.getWeightJewel()),
                new MaterialJewel(request.getMaterialJewel())
        );
    }

}
