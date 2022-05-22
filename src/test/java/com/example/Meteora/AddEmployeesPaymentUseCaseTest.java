package com.example.Meteora;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.commands.AddEmployeesPayment;
import com.example.Meteora.accountant.events.AccountantCreated;
import com.example.Meteora.accountant.events.EmployeesPaymentAdded;
import com.example.Meteora.accountant.values.AccountantID;
import com.example.Meteora.accountant.values.PaymentDate;
import com.example.Meteora.accountant.values.WageValue;
//import com.example.Meteora.usecases.AddEmployeesPaymentUseCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
/*
@ExtendWith(MockitoExtension.class)

class AddEmployeesPaymentUseCaseTest {

    @InjectMocks
    private AddEmployeesPaymentUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void addEmployeesPaymentToAccountant() {
//        given
        AccountantID accountantID = AccountantID.of("no accountant");
        WageValue wageValue = new WageValue(3000000);
        PaymentDate paymentDate = new PaymentDate(" Mayo 30");
        var command = new AddEmployeesPayment(accountantID, wageValue, paymentDate);

        when(repository.getEventsBy("no accountant")).thenReturn(history());
        useCase.addRepository(repository);

//        when
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getAccountantID().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
//        assert
        var event = (EmployeesPaymentAdded) events.get(0);
        assertEquals("3000000", event.getWageValue().value());
        assertEquals("Mayo 30", event.getPaymentDate().value());
        Mockito.verify(repository).getEventsBy("no accountant");
    }

    private List<DomainEvent> history() {
        AccountantID accountantID = AccountantID.of("no accountant");
        WageValue wageValue = new WageValue("3000000");
        var event = new AccountantCreated(wageValue);
        event.setAggregateRootId(accountantID.value());
        return List.of(event);
    }
}
*/