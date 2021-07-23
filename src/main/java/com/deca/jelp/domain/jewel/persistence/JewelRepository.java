package com.deca.jelp.domain.jewel.persistence;

import com.deca.jelp.domain.jewel.jewelData.InformationOfJewel;

public interface JewelRepository {
    void save(InformationOfJewel informationOfJewel);
}
