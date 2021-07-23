package com.deca.jelp.domain.jewel.persistence;

import com.deca.jelp.domain.jewel.jewelData.TypeJewel;

import java.util.List;

public interface TypeJewelRepository{
    List<TypeJewel> getTypes();
}
