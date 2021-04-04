package com.deca.jelp.domain.jewel.persistence;

import com.deca.jelp.domain.jewel.CaratsJewel;
import com.deca.jelp.domain.jewel.MaterialJewel;
import com.deca.jelp.domain.jewel.TypeJewel;
import com.deca.jelp.domain.jewel.WeightJewel;

import java.util.List;

public interface JewelRepository {
    void save(TypeJewel typeJewel, CaratsJewel caratsJewel, WeightJewel weightJewel, MaterialJewel materialJewel);
}
