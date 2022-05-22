package com.example.Meteora.salesDirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.salesDirector.values.ContactNumber;
import com.example.Meteora.salesDirector.values.CustomerAddress;
import com.example.Meteora.salesDirector.values.CustomerID;
import com.example.Meteora.sharedValues.CustomerName;

public class CustomerAdded extends DomainEvent {

    private final CustomerID customerID;
    private final CustomerAddress customerAddress;
    private final CustomerName customerName;
    private final ContactNumber contactNumber;


    public CustomerAdded(CustomerID customerID, CustomerAddress customerAddress, CustomerName customerName, ContactNumber contactNumber ) {
        super("com.example.Meteora.salesdirector.customeradded");
        this.customerID = customerID;
        this.customerAddress = customerAddress;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public CustomerName getCustomerName() {
        return customerName;
    }

    public ContactNumber getContactNumber() {
        return contactNumber;
    }
}