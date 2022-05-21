package com.example.Meteora.salesDirector;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.Meteora.salesDirector.events.SalesDirectorCreated;
import com.example.Meteora.salesDirector.values.SalesDirectorID;
import com.example.Meteora.sharedValues.SaleDate;

import java.util.Set;

public class SalesDirector extends AggregateEvent<SalesDirectorID> {

    protected SalesDirector salesDirector;
    protected SaleDate saleDate;
    protected Set<Customer> customers;
    protected Set<ProductSold> productsSold;

    public SalesDirector(SalesDirectorID entityId, SaleDate saleDate){
        super(entityId);
        appendChange(new SalesDirectorCreated(saleDate)).apply();
    }
}
