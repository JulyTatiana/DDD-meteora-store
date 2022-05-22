package com.example.Meteora.salesDirector.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.salesDirector.values.ContactNumber;
import com.example.Meteora.salesDirector.values.CustomerAddress;
import com.example.Meteora.salesDirector.values.SalesDirectorID;
import com.example.Meteora.sharedValues.CustomerName;

public class AddCustomer extends Command {

    private final SalesDirectorID salesDirectorID;
    private final CustomerName customerName;
    private final CustomerAddress customerAddress;
    private final ContactNumber contactNumber;

    public AddCustomer(SalesDirectorID salesDirectorID, CustomerName customerName, CustomerAddress customerAddress, ContactNumber contactNumber) {
        this.salesDirectorID = salesDirectorID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.contactNumber = contactNumber;
    }

    public SalesDirectorID getSalesDirectorID() {
        return salesDirectorID;
    }
    public CustomerName getCustomerName() {
        return customerName;
    }

    public CustomerAddress getCustomerAddress() { return customerAddress; }

    public ContactNumber getContactNumber() {
        return contactNumber;
    }

}
