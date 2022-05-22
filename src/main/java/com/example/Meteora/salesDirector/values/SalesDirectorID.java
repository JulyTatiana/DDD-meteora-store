package com.example.Meteora.salesDirector.values;

import co.com.sofka.domain.generic.Identity;

public class SalesDirectorID extends Identity {

    public SalesDirectorID(){
    }
    private SalesDirectorID(String id){
        super(id);
    }
    public static SalesDirectorID of(String id){
        return new SalesDirectorID(id);
    }
}
