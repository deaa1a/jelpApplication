package com.deca.jelp.application.jewel;

import com.deca.jelp.adapters.kindJewel.KindJewelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetJewel {

    private KindJewelRepository kindJewelRepository;

    @Autowired
    public  GetJewel(KindJewelRepository kindJewelRepository){
        this.kindJewelRepository = kindJewelRepository;
    }

    public void Execute(){
        kindJewelRepository.recovery();
    }

}
