package com.deca.jelp.application.jewel;

import com.deca.jelp.domain.jewel.CaratsJewel;
import com.deca.jelp.domain.jewel.MaterialJewel;
import com.deca.jelp.domain.jewel.TypeJewel;
import com.deca.jelp.domain.jewel.WeightJewel;
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

    public void Execute(TypeJewel typeJewel, CaratsJewel caratsJewel, WeightJewel weightJewel, MaterialJewel materialJewel){
        jewelRepository.save(typeJewel,
                caratsJewel,
                weightJewel,
                materialJewel);
    }

}
