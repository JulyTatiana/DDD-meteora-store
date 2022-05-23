package com.example.Meteora.logisticsCoordinator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.values.AccountantName;
import com.example.Meteora.logisticsCoordinator.values.CoordinatorName;

public class LogisticsCoordinatorCreated extends DomainEvent {

    //private parameter
    private final CoordinatorName coordinatorName;

    //Constructor
    //Between parentesis is a property that will transport from one place to another
    public LogisticsCoordinatorCreated(CoordinatorName coordinatorName){
        //it brings a type, the domain is meteora, accountantcreated is the specific type
        super("meteora.logisticscoordinator.logisticscoordinatorcreated");
        this.coordinatorName = coordinatorName;
    }

    //Get LOOK FOR A SHORCUT!
    //Flat Object, it's not an entity, it's only to transport objects like a DTO

    public CoordinatorName getCoordinatorName() {
        return coordinatorName;
    }
}
