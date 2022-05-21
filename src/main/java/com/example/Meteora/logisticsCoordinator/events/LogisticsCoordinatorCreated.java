package com.example.Meteora.logisticsCoordinator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.logisticsCoordinator.values.CoordinatorName;

public class LogisticsCoordinatorCreated extends DomainEvent {

    //private parameter
    private final CoordinatorName coordinatorName;

    public LogisticsCoordinatorCreated(CoordinatorName coordinatorName){
        super("meteora.logisticscoordinator.logisticscoordinatorcreated");
        this.coordinatorName = coordinatorName;
    }

    public CoordinatorName getCoordinatorName() {
        return coordinatorName;
    }
}
