package com.deca.jelp.adapters.kindJewel.api;

import com.deca.jelp.adapters.kindJewel.dto.TypeJewelResponseDto;
import com.deca.jelp.application.jewel.GetTypesJewelToBuy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReturnTypeJewel {

    private GetTypesJewelToBuy getTypesJewelToBuy;

    @Autowired
    ReturnTypeJewel(GetTypesJewelToBuy getTypesJewelToBuy){
        this.getTypesJewelToBuy = getTypesJewelToBuy;
    }

    @GetMapping(value = "jewels/type")
    public ResponseEntity<List<TypeJewelResponseDto>> getJewel(){
        return new ResponseEntity<>( TypeJewelResponseDto.from(getTypesJewelToBuy.Execute()), HttpStatus.ACCEPTED);
    }


}
