package com.example.Meteora.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.example.Meteora.accountant.Accountant;
import com.example.Meteora.accountant.commands.CreateAccountant;

public class CreateAccountantUseCase extends UseCase<RequestCommand <CreateAccountant>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateAccountant> createAccountantRequestCommand) {
        var command = createAccountantRequestCommand.getCommand();
        var accountant = new Accountant(
                command.getEntityId(),
                command.getAccountantName()
        );

        emit().onResponse(new ResponseEvents(accountant.getUncommittedChanges()));

    }
}
