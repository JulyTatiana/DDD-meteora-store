package com.example.Meteora.accountant;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.events.*;
import com.example.Meteora.accountant.values.*;
import com.example.Meteora.sharedValues.CustomerName;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Accountant extends AggregateEvent<AccountantID> {

    //States
    protected AccountantName accountantName;
    protected Set<EmployeesPayment> employeesPayments;
    protected Set<SaleBill> saleBills;

    //When I'm going to create the aggregate, when the aggregate is new:
    public Accountant(AccountantID entityId, AccountantName accountantName){
        super(entityId);
        //throw a domain event for each execution we have inside the aggregate, for example the behaviors or the creation of aggregate
        appendChange(new AccountantCreated(accountantName)).apply();
    }

    //To affect the states we have to implement a private constructor
    //PrivateConstructor:
    private Accountant(AccountantID accountantID){
        super(accountantID);
        //subscribe to the events: every time a behavior is executed an event is thrown
        // but this event will have a subscriber that will be looking the event in order to change the states of this aggregate
        subscribe(new AccountantChange(this));
    }

    //When we are going to create the aggregate
    public static Accountant from(AccountantID accountantID, List<DomainEvent> events){
        var accountant = new Accountant(accountantID);
        //for each account will be applied some events
        events.forEach(accountant::applyEvent);
        //it returns a created accountant
        return accountant;
    }

    //Behaviors
    public void AddAccountantName(AccountantName accountantName){
        appendChange(new AccountantNameAdded(accountantName)).apply();
    }
    public void AddEmployeesPayment (EmployeesPaymentID entityId, WageValue wageValue, PaymentDate paymentDate){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(wageValue);
        Objects.requireNonNull(paymentDate);
        appendChange(new EmployeesPaymentAdded(entityId, wageValue, paymentDate)).apply();
    }
    public void AddSaleBill (SaleBillID entityId, CustomerName customerName, TotalValue totalValue){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(customerName);
        Objects.requireNonNull(totalValue);
        appendChange(new SaleBillAdded(entityId, customerName, totalValue)).apply();
    }

    public void UpdateTotalValueOfBill (SaleBillID entityId, TotalValue totalValue ){
        appendChange(new TotalValueOfBillUpdated(entityId, totalValue)).apply();
    }

    //Find Behavior: EmployeesPayment by Id
    //protected in order to execute this only inside this package
    protected Optional<EmployeesPayment> getEmployeesPaymentById(EmployeesPaymentID employeesPaymentID){
        return employeesPayments()
                .stream()
                .filter(employeesPayment -> employeesPayment.identity().equals(entityId))
                .findFirst();
    }
    public Optional<SaleBill> getSaleBillById(SaleBillID saleBillID){
        return saleBills()
                .stream()
                .filter(saleBill -> saleBill.identity().equals(entityId))
                .findFirst();
    }

    //EncapsulationOfProperties
    public AccountantName accountantName(){
        return accountantName;
    }
    public AccountantID accountantID(){
        return entityId;
    }
    public Set<EmployeesPayment> employeesPayments(){
        return employeesPayments;
    }
    public Set<SaleBill> saleBills(){
        return saleBills;
    }

}
