package com.deca.jelp.adapters.jewel.purchase;

import com.deca.jelp.domain.jewel.jewerlyData.*;
import com.deca.jelp.domain.jewel.persistence.JewelRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JewelMysqlRepository implements JewelRepository {
    @Override
    public void save(JewelryInformation jewelryInformation) {
        System.out.println("Save in DB " +  jewelryInformation.getCaratsJewel() + "" + jewelryInformation.getTypeJewel() + "" + jewelryInformation.getWeightJewel() + "" + jewelryInformation.getMaterialJewel());
    }
}
