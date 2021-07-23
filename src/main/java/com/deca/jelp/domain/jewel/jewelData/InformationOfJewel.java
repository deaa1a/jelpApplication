package com.deca.jelp.domain.jewel.jewelData;

import com.deca.jelp.domain.customer.CustomerId;

public class InformationOfJewel {

    private CustomerId customerId;
    private CaratsJewel caratsJewel;
    private MaterialJewel materialJewel;
    private TypeJewel typeJewel;
    private WeightJewel weightJewel;
    private Nationality nationality;

    public InformationOfJewel(TypeJewel typeJewel, CaratsJewel caratsJewel, WeightJewel weightJewel, MaterialJewel materialJewel, Nationality nationality, CustomerId customerId) {
        this.caratsJewel = caratsJewel;
        this.materialJewel = materialJewel;
        this.typeJewel = typeJewel;
        this.weightJewel = weightJewel;
        this.nationality = nationality;
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

    public Nationality getNationality() {
        return nationality;
    }
}
