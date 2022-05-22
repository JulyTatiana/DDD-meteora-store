package com.example.Meteora.salesDirector;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.salesDirector.events.CustomerAdded;
import com.example.Meteora.salesDirector.values.ContactNumber;
import com.example.Meteora.salesDirector.values.CustomerAddress;
import com.example.Meteora.salesDirector.values.CustomerID;
import com.example.Meteora.salesDirector.values.SalesDirectorID;
import com.example.Meteora.sharedValues.CustomerName;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class SalesDirector extends AggregateEvent<SalesDirectorID> {

    protected Set<Customer> customerSet;
    protected Set<ProductSold> productSoldSet;

    public SalesDirector(SalesDirectorID entityId) {
        super(entityId);
        subscribe(new SalesDirectorChange(this));
    }

    public static SalesDirector from(SalesDirectorID salesDirectorID , List<DomainEvent> domainEvents) {
        SalesDirector salesDirector = new SalesDirector(salesDirectorID);
        domainEvents.forEach(salesDirector::applyEvent);
        return salesDirector;
    }
    //  events
    public void addCustomer(CustomerAddress customerAddress, CustomerName customerName, ContactNumber contactNumber) {
        CustomerID customerID = new CustomerID();
        appendChange(new CustomerAdded(customerID, customerAddress, customerName, contactNumber)).apply();
    }

    //    findById methods
    protected Optional<Customer> findCustomerById(CustomerID customerID) {
        return this.customerSet.stream().filter(customer -> customer.identity().equals(customerID)).findFirst();
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public Set<ProductSold> getProductSoldSet() {
        return productSoldSet;
    }

    public void setAggregateRootId(String value) {
    }
}
