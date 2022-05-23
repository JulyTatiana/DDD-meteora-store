package com.example.Meteora.logisticsCoordinator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.sharedValues.ProductName;

public class ProductNameOfInventoryUpdated extends DomainEvent {
    //private parameter
    private final ProductName productName;

    //constructor
    public ProductNameOfInventoryUpdated(ProductName productName) {
        super("meteora.logisticscoordinator.productname");
        this.productName = productName;
    }

    //Getter
    public ProductName getProductName() {
        return productName;
    }
}
