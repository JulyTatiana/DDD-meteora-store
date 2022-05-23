package com.example.Meteora.logisticsCoordinator.values;

import co.com.sofka.domain.generic.Identity;

public class InventoryID extends Identity {

    public InventoryID(){
    }
    private InventoryID(String id){
        super(id);
    }

    public static com.example.Meteora.logisticsCoordinator.values.InventoryID of(String id){
        return new com.example.Meteora.logisticsCoordinator.values.InventoryID(id);
    }
}
