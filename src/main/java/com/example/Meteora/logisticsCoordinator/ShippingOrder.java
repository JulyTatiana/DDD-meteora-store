package com.example.Meteora.logisticsCoordinator;

import co.com.sofka.domain.generic.Entity;
import com.example.Meteora.logisticsCoordinator.values.DeliveryDate;
import com.example.Meteora.logisticsCoordinator.values.ShippingOrderID;
import com.example.Meteora.logisticsCoordinator.values.Transporter;

public class ShippingOrder extends Entity<ShippingOrderID> {

    private final Transporter transporter;
    private final DeliveryDate deliveryDate;

    public ShippingOrder(ShippingOrderID entityId, Transporter transporter, DeliveryDate deliveryDate){
        super(entityId);
        this.transporter = transporter;
        this.deliveryDate = deliveryDate;
    }

    public Transporter transporter(){
        return transporter;
    }
    public DeliveryDate deliveryDate(){
        return deliveryDate;
    }
}
