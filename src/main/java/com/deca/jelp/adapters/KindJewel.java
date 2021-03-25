package com.deca.jelp.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KindJewel {

    private KindJewelRepository kindJewelRepository;

    @Autowired
    KindJewel(KindJewelRepository kindJewelRepository){
        this.kindJewelRepository = kindJewelRepository;
    }

    @GetMapping(value = "kind/jewel")
    public void KindJewelRepository(){
        kindJewelRepository.show();
    }


}
