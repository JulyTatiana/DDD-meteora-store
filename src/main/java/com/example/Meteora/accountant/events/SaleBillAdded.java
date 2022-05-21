package com.example.Meteora.accountant.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.values.SaleBillID;
import com.example.Meteora.accountant.values.TotalValue;
import com.example.Meteora.sharedValues.CustomerName;
import com.example.Meteora.sharedValues.SaleDate;

public class SaleBillAdded extends DomainEvent {

    private final SaleBillID entityId;
    private final SaleDate saleDate;
    private final CustomerName customerName;
    private final TotalValue totalValue;

    public SaleBillAdded(SaleBillID entityId, SaleDate saleDate, CustomerName customerName, TotalValue totalValue) {
        super("meteora.accountant.salebilladded");
        this.entityId = entityId;
        this.saleDate = saleDate;
        this.customerName = customerName;
        this.totalValue = totalValue;
    }

    public SaleBillID getEntityId() {
        return entityId;
    }
    public SaleDate getSaleDate() {
        return saleDate;
    }
    public CustomerName getCustomerName() {
        return customerName;
    }
    public TotalValue getTotalValue() {
        return totalValue;
    }
}
