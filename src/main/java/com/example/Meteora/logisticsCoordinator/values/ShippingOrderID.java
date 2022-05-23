package com.example.Meteora.logisticsCoordinator.values;

import co.com.sofka.domain.generic.Identity;

public class ShippingOrderID extends Identity {

    public ShippingOrderID(){
    }
    private ShippingOrderID(String id){
        super(id);
    }

    public static com.example.Meteora.logisticsCoordinator.values.ShippingOrderID of(String id){
        return new com.example.Meteora.logisticsCoordinator.values.ShippingOrderID(id);
    }
}
