package com.example.Meteora.accountant.values;

import co.com.sofka.domain.generic.Identity;

public class EmployeesPaymentID extends Identity {

    public EmployeesPaymentID(){

    }
    private EmployeesPaymentID(String id){
        super(id);
    }

    public static EmployeesPaymentID of(String id){
        return new EmployeesPaymentID(id);
    }
}
