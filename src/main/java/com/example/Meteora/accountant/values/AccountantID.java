package com.example.Meteora.accountant.values;

import co.com.sofka.domain.generic.Identity;
import com.example.Meteora.accountant.Accountant;

public class AccountantID extends Identity {

    public AccountantID(){

    }
    private AccountantID(String id){
        super(id);
    }

    public static AccountantID of(String id){
        return new AccountantID(id);
    }
}
