package com.example.Meteora.salesDirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.sharedValues.SaleDate;

public class SalesDirectorCreated extends DomainEvent {

    private final SaleDate saleDate;

    public SalesDirectorCreated(SaleDate saleDate){
        super("meteora.salesdirector.salesdirectorcreated");
        this.saleDate = saleDate;
    }

    public SaleDate getSaleDate() {
        return saleDate;
    }
}
