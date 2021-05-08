package com.deca.jelp.adapters.kindJewel;

import com.deca.jelp.domain.jewel.jewerlyData.TypeJewel;
import com.deca.jelp.domain.jewel.persistence.TypeJewelRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TypeJewelMySqlRepository implements TypeJewelRepository {

    @Override
    public List<TypeJewel> getTypes() {
        List<TypeJewel> types = new ArrayList<>();
        TypeJewel typeJewelOne = new TypeJewel("Manilla");
        TypeJewel typeJewelTwo = new TypeJewel("Anillo");
        TypeJewel typeJewelThree = new TypeJewel("Argolla");
        types.add(typeJewelOne);
        types.add(typeJewelTwo);
        types.add(typeJewelThree);
        return types;
    }
}
