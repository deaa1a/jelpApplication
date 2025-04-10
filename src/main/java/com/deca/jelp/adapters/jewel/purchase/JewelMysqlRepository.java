package com.deca.jelp.adapters.jewel.purchase;

import com.deca.jelp.adapters.jewel.purchase.hibernate.record.JewelDataRecord;
import com.deca.jelp.adapters.jewel.purchase.persistence.dao.JewelDataDAO;
import com.deca.jelp.domain.jewel.jewerlyData.JewelryInformation;
import com.deca.jelp.domain.jewel.persistence.JewelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JewelMysqlRepository implements JewelRepository {

    private JewelDataDAO jewelDataDAO;

    @Autowired
    public JewelMysqlRepository(JewelDataDAO jewelDataDAO){
        this.jewelDataDAO = jewelDataDAO;
    }

    @Override
    public void save(JewelryInformation jewelryInformation) {
            jewelDataDAO.save(JewelDataRecord.from(jewelryInformation));
    }
}
