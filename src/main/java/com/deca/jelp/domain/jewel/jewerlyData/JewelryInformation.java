package com.deca.jelp.domain.jewel.jewerlyData;

public class JewelryInformation {

    private CaratsJewel caratsJewel;
    private MaterialJewel materialJewel;
    private TypeJewel typeJewel;
    private WeightJewel weightJewel;

    public JewelryInformation(TypeJewel typeJewel, CaratsJewel caratsJewel, WeightJewel weightJewel, MaterialJewel materialJewel) {
        this.caratsJewel = caratsJewel;
        this.materialJewel = materialJewel;
        this.typeJewel = typeJewel;
        this.weightJewel = weightJewel;
    }

    public CaratsJewel getCaratsJewel() {
        return caratsJewel;
    }

    public MaterialJewel getMaterialJewel() {
        return materialJewel;
    }

    public TypeJewel getTypeJewel() {
        return typeJewel;
    }

    public WeightJewel getWeightJewel() {
        return weightJewel;
    }
}
