package com.example.Meteora.logisticsCoordinator.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.logisticsCoordinator.values.InventoryID;
import com.example.Meteora.logisticsCoordinator.values.LogisticsCoordinatorID;
import com.example.Meteora.sharedValues.ProductName;

public class UpdateProductNameOfInventory extends Command {

    private final LogisticsCoordinatorID logisticsCoordinatorID;
    private final InventoryID inventoryID;
    private final ProductName productName;


    public UpdateProductNameOfInventory(LogisticsCoordinatorID logisticsCoordinatorID, InventoryID inventoryID, ProductName productName) {
        this.logisticsCoordinatorID = logisticsCoordinatorID;
        this.inventoryID = inventoryID;
        this.productName = productName;
    }

    public LogisticsCoordinatorID getLogisticsCoordinatorID() {
        return logisticsCoordinatorID;
    }

    public InventoryID getInventoryID() {
        return inventoryID;
    }

    public ProductName getProductName() {
        return productName;
    }
}
