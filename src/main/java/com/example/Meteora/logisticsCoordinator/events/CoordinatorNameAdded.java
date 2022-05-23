package com.example.Meteora.logisticsCoordinator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.logisticsCoordinator.values.CoordinatorName;

public class CoordinatorNameAdded extends DomainEvent {
    //private parameter
    private final CoordinatorName coordinatorName;

    //constructor
    public CoordinatorNameAdded(CoordinatorName coordinatorName) {
        super("meteora.logisticscoordinator.coordinatornameadded");
        this.coordinatorName = coordinatorName;
    }

    //Getter
    public CoordinatorName getCoordinatorName() {
        return coordinatorName;
    }
}
