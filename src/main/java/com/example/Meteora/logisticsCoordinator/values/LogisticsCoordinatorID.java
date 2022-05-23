package com.example.Meteora.logisticsCoordinator.values;

import co.com.sofka.domain.generic.Identity;

public class LogisticsCoordinatorID extends Identity {

    public LogisticsCoordinatorID(){

    }
    private LogisticsCoordinatorID(String id){
        super(id);
    }

    public static com.example.Meteora.logisticsCoordinator.values.LogisticsCoordinatorID of(String id){
        return new com.example.Meteora.logisticsCoordinator.values.LogisticsCoordinatorID(id);
    }
}
