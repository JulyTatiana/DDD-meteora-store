package com.example.Meteora.salesDirector;

import co.com.sofka.domain.generic.AggregateEvent;
import com.example.Meteora.salesDirector.values.ContactNumber;
import com.example.Meteora.salesDirector.values.CustomerAddress;
import com.example.Meteora.salesDirector.values.CustomerID;
import com.example.Meteora.sharedValues.CustomerName;

public class Customer extends AggregateEvent<CustomerID> {

    private final CustomerAddress customerAddress;
    private final CustomerName customerName;
    private final ContactNumber contactNumber;

    public Customer(CustomerID entityId, CustomerAddress customerAddress, CustomerName customerName, ContactNumber contactNumber){
        super(entityId);
        this.customerAddress = customerAddress;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
    }

    public CustomerAddress customerAddress() {
        return customerAddress;
    }
    public CustomerName customerName() {
        return customerName;
    }
    public ContactNumber contactNumber() {
        return contactNumber;
    }
}
