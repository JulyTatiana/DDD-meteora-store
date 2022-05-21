package com.example.Meteora.logisticsCoordinator;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.Meteora.logisticsCoordinator.events.LogisticsCoordinatorCreated;
import com.example.Meteora.logisticsCoordinator.values.CoordinatorName;
import com.example.Meteora.logisticsCoordinator.values.LogisticsCoordinatorID;

import java.util.Set;

public class LogisticsCoordinator extends AggregateEvent<LogisticsCoordinatorID> {

    protected LogisticsCoordinatorID logisticsCoordinatorID;
    protected CoordinatorName coordinatorName;
    protected Set<Inventory> inventories;
    protected Set<ShippingOrder> shippingOrders;

    public LogisticsCoordinator(LogisticsCoordinatorID entityId, CoordinatorName coordinatorName){
        super(entityId);
        //Coordinator is created as a consequence of passing LogisticsCoordinatorID and CoordinatorName
        appendChange(new LogisticsCoordinatorCreated(coordinatorName)).apply();
    }
}
