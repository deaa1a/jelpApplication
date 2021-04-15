package com.deca.jelp.application.jewel;

import com.deca.jelp.domain.jewel.TypeJewel;
import com.deca.jelp.domain.jewel.persistence.TypeJewelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetTypesJewelToBuy {

    private TypeJewelRepository typeJewelRepository;

    @Autowired
    public GetTypesJewelToBuy(TypeJewelRepository typeJewelRepository){
        this.typeJewelRepository = typeJewelRepository;
    }

    public List<TypeJewel> Execute(){
        return typeJewelRepository.getTypes();
    }

}
