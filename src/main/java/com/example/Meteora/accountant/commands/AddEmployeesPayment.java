package com.example.Meteora.accountant.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.accountant.values.EmployeesPaymentID;
import com.example.Meteora.accountant.values.PaymentDate;
import com.example.Meteora.accountant.values.WageValue;

public class AddEmployeesPayment extends Command {

    private final EmployeesPaymentID entityId;
    private final WageValue wageValue;
    private final PaymentDate paymentDate;

    public AddEmployeesPayment(EmployeesPaymentID entityId, WageValue wageValue, PaymentDate paymentDate) {
        this.entityId = entityId;
        this.wageValue = wageValue;
        this.paymentDate = paymentDate;
    }

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

