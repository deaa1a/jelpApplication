package com.deca.jelp.domain.jewel.jewerlyData;

import com.deca.jelp.domain.customer.CustomerId;

public class JewelryInformation {

    private CustomerId customerId;
    private CaratsJewel caratsJewel;
    private MaterialJewel materialJewel;
    private TypeJewel typeJewel;
    private WeightJewel weightJewel;

    public JewelryInformation(TypeJewel typeJewel, CaratsJewel caratsJewel, WeightJewel weightJewel, MaterialJewel materialJewel, CustomerId customerId) {
        this.caratsJewel = caratsJewel;
        this.materialJewel = materialJewel;
        this.typeJewel = typeJewel;
        this.weightJewel = weightJewel;
        this.customerId = customerId;
    }


    public CustomerId getCustomerId() {
        return customerId;
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
