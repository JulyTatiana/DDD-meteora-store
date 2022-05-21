package com.example.Meteora.accountant.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.accountant.values.AccountantID;
import com.example.Meteora.accountant.values.AccountantName;

public class AddAccountantName extends Command {

    private final AccountantID accountantID;
    private final AccountantName accountantName;

    public AddAccountantName(AccountantID accountantID, AccountantName accountantName) {
        this.accountantID = accountantID;
        this.accountantName = accountantName;
    }

    public AccountantID getAccountantID() {
        return accountantID;
    }

    public AccountantName getAccountantName() {
        return accountantName;
    }
}
