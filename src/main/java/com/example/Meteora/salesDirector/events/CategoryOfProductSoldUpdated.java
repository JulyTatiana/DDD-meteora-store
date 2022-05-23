package com.example.Meteora.salesDirector.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.Meteora.salesDirector.values.ProductID;
import com.example.Meteora.salesDirector.values.QuantitySold;
import com.example.Meteora.sharedValues.Category;
import com.example.Meteora.sharedValues.ProductName;

public class CategoryOfProductSoldUpdated extends DomainEvent {

    private final ProductID productID;
    private final QuantitySold quantitySold;
    private final Category category;
    private final ProductName productName;

    public CategoryOfProductSoldUpdated(String type, ProductID productID, QuantitySold quantitySold, Category category, ProductName productName) {
        super(type);
        this.productID = productID;
        this.quantitySold = quantitySold;
        this.category = category;
        this.productName = productName;
    }

    public ProductID getProductID() {
        return productID;
    }

    public QuantitySold getQuantitySold() {
        return quantitySold;
    }

    public Category getCategory() {
        return category;
    }

    public ProductName getProductName() {
        return productName;
    }
}
