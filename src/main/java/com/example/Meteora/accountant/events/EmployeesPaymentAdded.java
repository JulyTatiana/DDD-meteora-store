package com.example.Meteora.accountant.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.values.EmployeesPaymentID;
import com.example.Meteora.accountant.values.PaymentDate;
import com.example.Meteora.accountant.values.WageValue;

public class EmployeesPaymentAdded extends DomainEvent {

    //private parameters
    private final EmployeesPaymentID entityId;
    private final WageValue wageValue;
    private final PaymentDate paymentDate;

    //Constructor
    public EmployeesPaymentAdded (EmployeesPaymentID entityId, WageValue wageValue, PaymentDate paymentDate){
        super("meteora.accountant.employeespaymentadded");
        this.entityId = entityId;
        this.wageValue = wageValue;
        this.paymentDate = paymentDate;
    }

    //Getters, flat objects to transport objects like a DTO does
    public EmployeesPaymentID getEntityId() {
        return entityId;
    }
    public WageValue getWageValue() {
        return wageValue;
    }
    public PaymentDate getPaymentDate() {
        return paymentDate;
    }

}
