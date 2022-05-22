package com.example.Meteora.accountant;

import co.com.sofka.domain.generic.Entity;
import com.example.Meteora.accountant.values.SaleBillID;
import com.example.Meteora.accountant.values.TotalValue;
import com.example.Meteora.sharedValues.CustomerName;

import java.util.Objects;


public class SaleBill extends Entity<SaleBillID> {

    private CustomerName customerName;
    private TotalValue totalValue;

    public SaleBill(SaleBillID entityId, CustomerName customerName, TotalValue totalValue){
        super(entityId);
        this.customerName = customerName;
        this.totalValue = totalValue;
    }

    //Behaviors
    public void UpdateTotalValue(TotalValue totalValue){

        this.totalValue = Objects.requireNonNull(totalValue);
    }
    public void AddCustomerName(CustomerName customerName){
        this.customerName = Objects.requireNonNull(customerName);
    }

    //Properties
    public CustomerName customerName(){
        return customerName;
    }
    public TotalValue totalValue(){
        return totalValue;
    }

}
