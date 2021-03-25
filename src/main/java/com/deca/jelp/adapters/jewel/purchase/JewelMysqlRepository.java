package com.deca.jelp.adapters.jewel.purchase;

import com.deca.jelp.domain.jewel.CaratsJewel;
import com.deca.jelp.domain.jewel.MaterialJewel;
import com.deca.jelp.domain.jewel.TypeJewel;
import com.deca.jelp.domain.jewel.WeightJewel;
import com.deca.jelp.domain.jewel.persistence.JewelRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JewelMysqlRepository implements JewelRepository {
    @Override
    public void save(TypeJewel typeJewel, CaratsJewel caratsJewel, WeightJewel weightJewel, MaterialJewel materialJewel) {
        System.out.println("Save in DB " + typeJewel.getValue()+ " " + caratsJewel.getValue() + " " + weightJewel.getValue() + " " + materialJewel.getValue());
    }
}
