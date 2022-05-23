package com.example.Meteora.logisticsCoordinator.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.accountant.values.SaleBillID;
import com.example.Meteora.accountant.values.TotalValue;
import com.example.Meteora.logisticsCoordinator.values.DeliveryDate;
import com.example.Meteora.logisticsCoordinator.values.ShippingOrderID;
import com.example.Meteora.logisticsCoordinator.values.Transporter;
import com.example.Meteora.sharedValues.CustomerName;

public class AddShippingOrder extends Command {

    private final ShippingOrderID shippingOrderID;
    private final Transporter transporter;
    private final DeliveryDate deliveryDate;

    public AddShippingOrder(ShippingOrderID shippingOrderID, Transporter transporter, DeliveryDate deliveryDate) {
        this.shippingOrderID = shippingOrderID;
        this.transporter = transporter;
        this.deliveryDate = deliveryDate;
    }

    public ShippingOrderID getShippingOrderID() {
        return shippingOrderID;
    }

    public Transporter getTransporter() {
        return transporter;
    }

    public DeliveryDate getDeliveryDate() {
        return deliveryDate;
    }
}