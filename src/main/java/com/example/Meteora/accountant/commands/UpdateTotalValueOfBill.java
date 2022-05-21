package com.example.Meteora.accountant.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.accountant.values.AccountantID;
import com.example.Meteora.accountant.values.SaleBillID;
import com.example.Meteora.accountant.values.TotalValue;

public class UpdateTotalValueOfBill extends Command {

    private final AccountantID accountantID;
    private final SaleBillID entityId;
    private final TotalValue totalValue;

    public UpdateTotalValueOfBill(AccountantID accountantID, SaleBillID entityId, TotalValue totalValue) {
        this.accountantID = accountantID;
        this.entityId = entityId;
        this.totalValue = totalValue;
    }

    public AccountantID getAccountantID() {
        return accountantID;
    }

    public SaleBillID getEntityId() {
        return entityId;
    }

    public TotalValue getTotalValue() {
        return totalValue;
    }
}
