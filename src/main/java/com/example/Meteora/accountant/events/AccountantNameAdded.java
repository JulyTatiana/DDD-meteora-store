package com.example.Meteora.accountant.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.values.AccountantName;

public class AccountantNameAdded extends DomainEvent {

    //private parameter
    private final AccountantName accountantName;

    //constructor
    public AccountantNameAdded(AccountantName accountantName) {
        super("meteora.accountant.accountantnameadded");
        this.accountantName = accountantName;
    }

    //Getter
    public AccountantName getAccountantName() {
        return accountantName;
    }
}
