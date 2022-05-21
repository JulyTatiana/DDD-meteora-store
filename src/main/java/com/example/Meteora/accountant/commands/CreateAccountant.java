package com.example.Meteora.accountant.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.accountant.values.AccountantID;
import com.example.Meteora.accountant.values.AccountantName;

public class CreateAccountant extends Command {

    private final AccountantID entityId;
    private final AccountantName accountantName;

    public CreateAccountant(AccountantID entityId, AccountantName accountantName) {
        this.entityId = entityId;
        this.accountantName = accountantName;
    }
    public AccountantID getEntityId() {
        return entityId;
    }
    public AccountantName getAccountantName() {
        return accountantName;
    }

}
