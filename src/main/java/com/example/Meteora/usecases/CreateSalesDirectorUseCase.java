package com.example.Meteora.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.example.Meteora.accountant.Accountant;
import com.example.Meteora.accountant.commands.CreateAccountant;
import com.example.Meteora.accountant.commands.CreateSalesDirector;
import com.example.Meteora.salesDirector.SalesDirector;

public class CreateSalesDirectorUseCase extends UseCase<RequestCommand<CreateSalesDirector>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateSalesDirector> createSalesDirectorRequestCommand) {
        var command = createSalesDirectorRequestCommand.getCommand();
        var salesDirector = new SalesDirector(
                command.getEntityId()
        );

        emit().onResponse(new ResponseEvents(salesDirector.getUncommittedChanges()));

    }
}
