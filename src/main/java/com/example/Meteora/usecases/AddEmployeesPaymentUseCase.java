package com.example.Meteora.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.example.Meteora.accountant.Accountant;
import com.example.Meteora.accountant.commands.AddEmployeesPayment;

/*

public class AddEmployeesPaymentUseCase extends UseCase<RequestCommand<AddEmployeesPayment>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddEmployeesPayment> addEmployeesPaymentRequestCommand) {
        var command = addEmployeesPaymentRequestCommand.getCommand();
        Accountant accountant = Accountant.from(command.getAccountantID(), repository().getEventsBy(command.getAccountantID().value()));

        accountant.addEmployeesPayment(command.getWageValue(), command.getPaymentDate());

        emit().onResponse(new ResponseEvents(accountant.getUncommittedChanges()));

    }
}

 */
