package com.example.Meteora.accountant.values;

import co.com.sofka.domain.generic.Identity;

public class SaleBillID extends Identity {
    public SaleBillID(){

    }
    private SaleBillID(String id){
        super(id);
    }

    public static SaleBillID of(String id){
        return new SaleBillID(id);
    }
}
