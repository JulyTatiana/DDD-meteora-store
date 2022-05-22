package com.example.Meteora;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.commands.CreateAccountant;
import com.example.Meteora.accountant.commands.CreateSalesDirector;
import com.example.Meteora.accountant.events.AccountantCreated;
import com.example.Meteora.accountant.values.AccountantID;
import com.example.Meteora.accountant.values.AccountantName;
import com.example.Meteora.salesDirector.events.SalesDirectorCreated;
import com.example.Meteora.salesDirector.values.SalesDirectorID;
import com.example.Meteora.usecases.CreateAccountantUseCase;
import com.example.Meteora.usecases.CreateSalesDirectorUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateSalesDirectorUseCaseTest {
    private CreateSalesDirectorUseCase useCase;

    @BeforeEach
    public void setUp() {
        useCase = new CreateSalesDirectorUseCase();
    }

    @Test
    public void createSalesDirectorSuccessfully() {
//      Arrange (Command with its constructor)
        SalesDirectorID salesDirectorID = SalesDirectorID.of("no accountant");
        CreateSalesDirector command = new CreateSalesDirector(salesDirectorID);
//      Act
        List<DomainEvent> domainEvents = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

//      assert
        SalesDirectorCreated salesDirectorCreated = (SalesDirectorCreated) domainEvents.get(0);
        assertEquals("no accountant", salesDirectorCreated.aggregateRootId());

    }
}
