package com.example.Meteora.accountant.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.values.SaleBillID;
import com.example.Meteora.accountant.values.TotalValue;
import com.example.Meteora.sharedValues.CustomerName;

public class SaleBillAdded extends DomainEvent {

    private final SaleBillID entityId;
    private final CustomerName customerName;
    private final TotalValue totalValue;

    public SaleBillAdded(SaleBillID entityId, CustomerName customerName, TotalValue totalValue) {
        super("meteora.accountant.salebilladded");
        this.entityId = entityId;
        this.customerName = customerName;
        this.totalValue = totalValue;
    }

    public SaleBillID getEntityId() {
        return entityId;
    }
    public CustomerName getCustomerName() {
        return customerName;
    }
    public TotalValue getTotalValue() {
        return totalValue;
    }
}
