package com.example.Meteora.salesDirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.salesDirector.values.ProductID;
import com.example.Meteora.salesDirector.values.QuantitySold;
import com.example.Meteora.sharedValues.Category;
import com.example.Meteora.sharedValues.ProductName;

public class ProductSoldAdded extends DomainEvent {

    private final Category category;
    private final ProductName productName;
    private final QuantitySold quantitySold;
    private final ProductID productID;

    public ProductSoldAdded(String type, Category category, ProductName productName, QuantitySold quantitySold, ProductID productID) {
        super(type);
        this.category = category;
        this.productName = productName;
        this.quantitySold = quantitySold;
        this.productID = productID;
    }

    public Category getCategory() {
        return category;
    }

    public ProductName getProductName() {
        return productName;
    }

    public QuantitySold getQuantitySold() {
        return quantitySold;
    }

    public ProductID getProductID() {
        return productID;
    }
}