package com.deca.jelp.adapters.kindJewel.api;

import com.deca.jelp.application.jewel.GetJewel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KindJewel {

    private GetJewel getJewel;

    @Autowired
    KindJewel(GetJewel getJewel){
        this.getJewel = getJewel;
    }

    @GetMapping(value = "jewels/type")
    public void getJewel(){
        getJewel.Execute();
    }


}
