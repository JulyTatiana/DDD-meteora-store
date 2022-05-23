package com.example.Meteora.logisticsCoordinator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.logisticsCoordinator.Inventory;

public class InventoryAdded extends DomainEvent {
    //private parameter
    private final Inventory inventory;

    //constructor
    public InventoryAdded(Inventory inventory) {
        super("meteora.logisticscoordinator.inventoryadded");
        this.inventory = inventory;
    }

    //Getter
    public Inventory getInventory() {
        return inventory;
    }
}
