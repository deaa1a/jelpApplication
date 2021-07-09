package com.deca.jelp.domain.jewel.persistence;

import com.deca.jelp.domain.jewel.jewerlyData.JewelryInformation;

public interface JewelRepository {
    void save(JewelryInformation jewelryInformation);
}
