package com.deca.jelp.domain.RegisterClient.persitence;


import com.deca.jelp.domain.client.*;


public interface CustomerRegistration {
    void save(Name name, CellphoneNumber cellphoneNumber, IdNumber idNumber, CityIdentifyCard cityIdentifyCard, CityResidence cityResidence);
}
