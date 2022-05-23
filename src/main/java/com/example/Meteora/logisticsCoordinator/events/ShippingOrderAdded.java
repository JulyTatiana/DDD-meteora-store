package com.example.Meteora.logisticsCoordinator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.logisticsCoordinator.ShippingOrder;

public class ShippingOrderAdded extends DomainEvent {
    //private parameter
    private final ShippingOrder shippingOrder;

    //constructor
    public ShippingOrderAdded(ShippingOrder shippingOrder) {
        super("meteora.logisticscoordinator.shippingorderadded");
        this.shippingOrder = shippingOrder;
    }

    //Getter

    public ShippingOrder getShippingOrder() {
        return shippingOrder;
    }
}
