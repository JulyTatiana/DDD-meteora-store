package com.example.Meteora.accountant.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.values.AccountantName;

public class AccountantCreated extends DomainEvent {

    //private parameter
    private final AccountantName accountantName;

    //Constructor
    //Between parentesis is a property that will transport from one place to another
    public AccountantCreated(AccountantName accountantName){
        //it brings a type, the domain is meteora, accountantcreated is the specific type
        super("meteora.accountant.accountantcreated");
        this.accountantName = accountantName;
    }

    //Get LOOK FOR A SHORCUT!
    //Flat Object, it's not an entity, it's only to transport objects like a DTO
    public AccountantName getAccountantName(){
        return accountantName;
    }

}
