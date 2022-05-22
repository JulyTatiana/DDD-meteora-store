package com.example.Meteora.accountant;

import co.com.sofka.domain.generic.Entity;
import com.example.Meteora.accountant.values.EmployeesPaymentID;
import com.example.Meteora.accountant.values.PaymentDate;
import com.example.Meteora.accountant.values.WageValue;

import java.util.Objects;

public class EmployeesPayment extends Entity<EmployeesPaymentID> {

    private WageValue wageValue;
    private PaymentDate paymentDate;

    public EmployeesPayment(EmployeesPaymentID entityId, WageValue wageValue, PaymentDate paymentDate){
        super(entityId);
        this.wageValue = wageValue;
        this.paymentDate = paymentDate;
    }

    /*
    Behaviors of EmployeesPayment Entity
     */
    //Validating objects:
    public void addWageValue(WageValue wageValue){
        //Validate that is not null
        this.wageValue = Objects.requireNonNull(wageValue);
    }
    public void addPaymentDate(PaymentDate paymentDate){

        this.paymentDate = Objects.requireNonNull(paymentDate);
    }

    /*
    Properties:
     */
    public WageValue wageValue() {
        return wageValue;
    }
    public PaymentDate paymentDate() {
        return paymentDate;
    }

}