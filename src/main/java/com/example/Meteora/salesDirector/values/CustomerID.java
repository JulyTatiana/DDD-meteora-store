package com.example.Meteora.salesDirector.values;

import co.com.sofka.domain.generic.Identity;
import com.example.Meteora.salesDirector.Customer;

public class CustomerID extends Identity {

    public CustomerID(){
    }
    private CustomerID(String id){
        super(id);
    }
    public static CustomerID of(String id){
        return new CustomerID(id);
    }
}
