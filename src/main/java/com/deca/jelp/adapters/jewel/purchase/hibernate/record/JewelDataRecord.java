package com.deca.jelp.adapters.jewel.purchase.hibernate.record;

import com.deca.jelp.domain.jewel.jewerlyData.JewelryInformation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jewel_data", schema = "Jelp")
public class JewelDataRecord {
    @Id
    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "type_jewel")
    private String typeJewel;

    @Column(name = "carats_jewel")
    private String caratsJewel;

    @Column(name = "weight_jewel")
    private String weightJewel;

    @Column(name = "material_jewel")
    private String materialJewel;


    public static JewelDataRecord from(JewelryInformation jewelryInformation){
        JewelDataRecord record = new JewelDataRecord();

        record.setCustomerId(jewelryInformation.getCustomerId().getValue());
        record.setCaratsJewel(jewelryInformation.getCaratsJewel().getValue());
        record.setMaterialJewel(jewelryInformation.getMaterialJewel().getValue());
        record.setTypeJewel(jewelryInformation.getTypeJewel().getValue());
        record.setWeightJewel(jewelryInformation.getWeightJewel().getValue());

        return record;
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
