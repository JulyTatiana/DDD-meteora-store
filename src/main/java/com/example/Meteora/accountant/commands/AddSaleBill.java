package com.example.Meteora.accountant.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.accountant.SaleBill;
import com.example.Meteora.accountant.values.SaleBillID;
import com.example.Meteora.accountant.values.TotalValue;
import com.example.Meteora.sharedValues.CustomerName;
import com.example.Meteora.sharedValues.SaleDate;

public class AddSaleBill extends Command {

    private final SaleBillID saleBillID;
    private final SaleDate saleDate;
    private final CustomerName customerName;
    private final TotalValue totalValue;

    public AddSaleBill(SaleBillID entityId, SaleDate saleDate, CustomerName customerName, TotalValue totalValue) {
        this.saleBillID = entityId;
        this.saleDate = saleDate;
        this.customerName = customerName;
        this.totalValue = totalValue;
    }

    public SaleBillID getSaleBillID() {
        return saleBillID;
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
