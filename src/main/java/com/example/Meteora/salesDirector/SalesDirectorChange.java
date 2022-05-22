package com.example.Meteora.salesDirector;

import co.com.sofka.domain.generic.EventChange;
import com.example.Meteora.salesDirector.events.SalesDirectorCreated;

import java.util.HashSet;

public class SalesDirectorChange extends EventChange {
    SalesDirectorChange(SalesDirector salesDirector) {
        apply((SalesDirectorCreated event) -> {
            salesDirector.customerSet = new HashSet<>();
            salesDirector.productSoldSet = new HashSet<>();
        });
    }
}
