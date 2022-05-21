package com.example.Meteora.accountant.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.values.SaleBillID;
import com.example.Meteora.accountant.values.TotalValue;

public class TotalValueOfBillUpdated extends DomainEvent {

    private final SaleBillID entityId;
    private final TotalValue totalValue;

    public TotalValueOfBillUpdated(SaleBillID entityId, TotalValue totalValue) {
        super("meteora.accountant.totalvalueofbillupdated");
        this.entityId = entityId;
        this.totalValue = totalValue;
    }

    public SaleBillID getEntityId() {
        return entityId;
    }
    public TotalValue getTotalValue() {
        return totalValue;
    }
}
