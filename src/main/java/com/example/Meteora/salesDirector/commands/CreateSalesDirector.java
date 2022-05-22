package com.example.Meteora.accountant.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.accountant.values.AccountantID;
import com.example.Meteora.accountant.values.AccountantName;
import com.example.Meteora.salesDirector.values.SalesDirectorID;

public class CreateSalesDirector extends Command {

    private final SalesDirectorID entityId;

    public CreateSalesDirector(SalesDirectorID entityId) {
        this.entityId = entityId;
    }
    public SalesDirectorID getEntityId() {
        return entityId;
    }

}