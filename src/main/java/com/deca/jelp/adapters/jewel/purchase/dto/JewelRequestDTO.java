package com.deca.jelp.adapters.jewel.purchase.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JewelRequestDTO {

    @JsonProperty(value = "type_jewel")
    private String typeJewel;
    @JsonProperty(value = "carats_jewel")
    private String caratsJewel;
    @JsonProperty(value = "weight_jewel")
    private String weightJewel;
    @JsonProperty(value = "material_jewel")
    private String materialJewel;

    public JewelRequestDTO(String typeJewel, String caratsJewel, String weightJewel, String materialJewel) {
        this.typeJewel = typeJewel;
        this.caratsJewel = caratsJewel;
        this.weightJewel = weightJewel;
        this.materialJewel = materialJewel;
    }

    public String getTypeJewel() {
        return typeJewel;
    }

    public void setTypeJewel(String typeJewel) {
        this.typeJewel = typeJewel;
    }

    public String getCaratsJewel() {
        return caratsJewel;
    }

    public void setCaratsJewel(String caratsJewel) {
        this.caratsJewel = caratsJewel;
    }

    public String getWeightJewel() {
        return weightJewel;
    }

    public void setWeightJewel(String weightJewel) {
        this.weightJewel = weightJewel;
    }

    public String getMaterialJewel() {
        return materialJewel;
    }

    public void setMaterialJewel(String materialJewel) {
        this.materialJewel = materialJewel;
    }
}
