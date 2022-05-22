package com.example.Meteora.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.example.Meteora.salesDirector.SalesDirector;
import com.example.Meteora.salesDirector.commands.AddCustomer;

public class AddCustomerUseCase extends UseCase<RequestCommand<AddCustomer>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddCustomer> addCustomerRequestCommand) {
        var command = addCustomerRequestCommand.getCommand();
        SalesDirector salesDirector = SalesDirector.from(command.getSalesDirectorID(), repository().getEventsBy(command.getSalesDirectorID().value()));

        salesDirector.addCustomer(command.getCustomerAddress(), command.getCustomerName(), command.getContactNumber());

        emit().onResponse(new ResponseEvents(salesDirector.getUncommittedChanges()));

    }
}