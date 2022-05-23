package com.example.Meteora.logisticsCoordinator.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.accountant.values.SaleBillID;
import com.example.Meteora.accountant.values.TotalValue;
import com.example.Meteora.logisticsCoordinator.values.InventoryID;
import com.example.Meteora.logisticsCoordinator.values.Quantity;
import com.example.Meteora.sharedValues.Category;
import com.example.Meteora.sharedValues.CustomerName;
import com.example.Meteora.sharedValues.ProductName;

public class AddInventory extends Command {

    private final InventoryID inventoryID;
    private final ProductName productName;
    private final Category category;
    private final Quantity quantity;

    public AddInventory(InventoryID inventoryID, ProductName productName, Category category, Quantity quantity) {
        this.inventoryID = inventoryID;
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
    }

    public InventoryID getInventoryID() {
        return inventoryID;
    }

    public ProductName getProductName() {
        return productName;
    }

    public Category getCategory() {
        return category;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
