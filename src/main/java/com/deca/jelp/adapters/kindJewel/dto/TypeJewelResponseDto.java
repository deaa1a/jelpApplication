package com.deca.jelp.adapters.kindJewel.dto;

import com.deca.jelp.domain.jewel.jewelData.TypeJewel;

import java.util.List;
import java.util.stream.Collectors;

public class TypeJewelResponseDto {
    private String typeJewel;

    private TypeJewelResponseDto(String typeJewel){
        this.typeJewel = typeJewel;
    }

    public String getTypeJewel() {
        return typeJewel;
    }

    public void setTypeJewel(String typeJewel) {
        this.typeJewel = typeJewel;
    }

    public static List<TypeJewelResponseDto> from (List<TypeJewel> types){
        return types.stream()
                .map(typeJewel -> new TypeJewelResponseDto(typeJewel.getValue()))
                .collect(Collectors.toList());
    }
}
