package com.deca.jelp.application.jewel;

import com.deca.jelp.domain.jewel.jewerlyData.JewelryInformation;
import com.deca.jelp.domain.jewel.persistence.JewelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveJewel {

    private JewelRepository jewelRepository;

    @Autowired
    public SaveJewel(JewelRepository jewelRepository){
        this.jewelRepository = jewelRepository;
    }

    public void execute(JewelryInformation jewelryInformation){
        jewelRepository.save(jewelryInformation);
    }


}
