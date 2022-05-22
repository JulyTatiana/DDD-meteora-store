package com.example.Meteora.accountant;

import co.com.sofka.domain.generic.EventChange;
import com.example.Meteora.accountant.events.*;

import java.util.HashSet;

public class AccountantChange extends EventChange {
    public AccountantChange(Accountant accountant) {

        //FIRST: Accountant created
        //Applying a consumer.
        //Behaviors applied, the states are separated
        apply((AccountantCreated event) ->{
            //States of Root Entity:
            accountant.accountantName = event.getAccountantName();
            //We give an initial value to the functions:
            accountant.employeesPayments = new HashSet<>();
            accountant.saleBills = new HashSet<>();
        });

        //Accountant name could be changed
        apply((AccountantNameAdded event) ->{
            accountant.accountantName = event.getAccountantName();
        });


        apply((TotalValueOfBillUpdated event)->{
            var saleBill = accountant.getSaleBillById(event.getEntityId())
                    .orElseThrow(()-> new IllegalArgumentException("the UpdateTotalValue function wasn't found"));
            saleBill.UpdateTotalValue(event.getTotalValue());

        });

        //Functions were added to the accountant
        apply((EmployeesPaymentAdded event)-> {
            var numEmployeesPayments = accountant.employeesPayments().size();
            if(numEmployeesPayments == 50){
                throw new IllegalArgumentException("You can add more EmployeesPayments, the maximun number is 50.");
            }
            accountant.employeesPayments.add(new EmployeesPayment(
                    event.getEntityId(),
                    event.getWageValue(),
                    event.getPaymentDate()
            ));
        });

        apply((SaleBillAdded event)-> {
            var numSaleBills = accountant.saleBills().size();
            if(numSaleBills == 10000){
                throw new IllegalArgumentException("You can add more numSaleBills, the maximun number is 10000.");
            }
            accountant.saleBills.add(new SaleBill(
                    event.getEntityId(),
                    event.getCustomerName(),
                    event.getTotalValue()
            ));
        });
    }
}
