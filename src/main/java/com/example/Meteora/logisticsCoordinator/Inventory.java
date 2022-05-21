package com.example.Meteora.logisticsCoordinator;

import co.com.sofka.domain.generic.Entity;
import com.example.Meteora.logisticsCoordinator.values.InventoryID;
import com.example.Meteora.logisticsCoordinator.values.Quantity;
import com.example.Meteora.sharedValues.Category;
import com.example.Meteora.sharedValues.ProductName;

public class Inventory extends Entity<InventoryID> {

    private final ProductName productName;
    private final Category category;
    private final Quantity quantity;

    public Inventory(InventoryID entityId, ProductName productName, Category category, Quantity quantity){
        super(entityId);
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
    }


    public ProductName productName(){
        return productName;
    }
    public Category category(){
        return category;
    }
    public Quantity quantity(){
        return quantity;
    }
}
