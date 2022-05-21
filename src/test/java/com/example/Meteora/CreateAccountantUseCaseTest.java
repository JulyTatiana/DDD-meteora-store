package com.example.Meteora;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.commands.CreateAccountant;
import com.example.Meteora.accountant.events.AccountantCreated;
import com.example.Meteora.accountant.values.AccountantID;
import com.example.Meteora.accountant.values.AccountantName;
import com.example.Meteora.usecases.CreateAccountantUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreateAccountantUseCaseTest {
    private CreateAccountantUseCase useCase;

    @BeforeEach
    public void setUp() {
        useCase = new CreateAccountantUseCase();
    }

    @Test
    public void createAccountantSuccessfully() {
//      Arrange (Command with its constructor)
        AccountantID accountantID = AccountantID.of("no accountant");
        AccountantName accountantName = new AccountantName("Salomon");
        CreateAccountant command = new CreateAccountant(accountantID, accountantName);
//      Act
        List<DomainEvent> domainEvents = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

//      assert
        AccountantCreated accountantCreated = (AccountantCreated) domainEvents.get(0);
        assertEquals("no accountant", accountantCreated.aggregateRootId());
        assertEquals("Salomon", accountantCreated.getAccountantName().value());

    }

}


/*
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.accountant.commands.CreateAccountant;
import com.example.Meteora.accountant.events.AccountantCreated;
import com.example.Meteora.accountant.values.AccountantID;
import com.example.Meteora.accountant.values.AccountantName;
import com.example.Meteora.usecases.CreateAccountantUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreateAccountantUseCaseTest {

    private CreateAccountantUseCase useCase;

    @BeforeEach
    public void setUp() {
        useCase = new CreateAccountantUseCase();
    }

    @Test
    void createAccountantWithAllTheParameters(){
        //Arrange (Command with its constructor)

        AccountantID accountantID = AccountantID.of("unrealAccountant");

        var command = new CreateAccountant(
                AccountantID.of("xxxx"),
                new AccountantName ("Salomon")
        );

        var useCase = new CreateAccountantUseCase();

        //Act
        List<DomainEvent> domainEvents = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        AccountantCreated trainerCreated = (AccountantCreated) domainEvents.get(0);
        AccountantCreated accountantCreated = null;
        assertEquals("xxxx", accountantCreated.aggregateRootId());
        assertEquals("Salomon", accountantCreated.getAccountantName().value());


    }
}

*/
