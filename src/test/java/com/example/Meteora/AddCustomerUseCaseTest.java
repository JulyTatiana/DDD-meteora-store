package com.example.Meteora;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.salesDirector.SalesDirector;
import com.example.Meteora.salesDirector.commands.AddCustomer;
import com.example.Meteora.salesDirector.events.CustomerAdded;
import com.example.Meteora.salesDirector.events.SalesDirectorCreated;
import com.example.Meteora.salesDirector.values.ContactNumber;
import com.example.Meteora.salesDirector.values.CustomerAddress;
import com.example.Meteora.salesDirector.values.CustomerID;
import com.example.Meteora.salesDirector.values.SalesDirectorID;
import com.example.Meteora.sharedValues.CustomerName;
import com.example.Meteora.usecases.AddCustomerUseCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AddCustomerUseCaseTest {

    @InjectMocks
    private AddCustomerUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void addCustomerToSalesDirector() {
        SalesDirectorID salesDirectorID = SalesDirectorID.of("no SalesDirector");

        CustomerAddress customerAddress = new CustomerAddress("Buenos Aires");
        CustomerName customerName = new CustomerName("Salomon2");
        ContactNumber contactNumber = new ContactNumber("3105968248");
        var command = new AddCustomer(salesDirectorID, customerName, customerAddress, contactNumber);

        when(repository.getEventsBy("no salesDirector")).thenReturn(history());
        useCase.addRepository(repository);

//      events
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getSalesDirectorID().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
//      assert
        var event = (CustomerAdded) events.get(0);
        assertEquals("Buenos Aires", event.getCustomerAddress().value());
        assertEquals("3105968248", event.getContactNumber().value());
        assertEquals("Salomon2", event.getCustomerName().value());
        Mockito.verify(repository).getEventsBy("no SalesDirector");
    }

    private List<DomainEvent> history() {
        SalesDirectorID salesDirectorID = SalesDirectorID.of("no SalesDirector");
        var event = new SalesDirectorCreated();
        event.setAggregateRootId(salesDirectorID.value());
        return List.of(event);
    }

}
