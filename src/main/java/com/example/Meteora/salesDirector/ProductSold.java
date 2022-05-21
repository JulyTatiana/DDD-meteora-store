package com.example.Meteora.salesDirector;

import co.com.sofka.domain.generic.Entity;
import com.example.Meteora.salesDirector.values.ProductID;
import com.example.Meteora.salesDirector.values.QuantitySold;
import com.example.Meteora.sharedValues.Category;
import com.example.Meteora.sharedValues.ProductName;

public class ProductSold extends Entity<ProductID> {

    private final ProductName productName;
    private final Category category;
    private final QuantitySold quantitySold;

    public ProductSold(ProductID entityId, ProductName productName, Category category, QuantitySold quantitySold){
        super(entityId);
        this.productName = productName;
        this.category = category;
        this.quantitySold = quantitySold;
    }

    public ProductName productName(){
        return (productName);
    }
    public Category category(){
        return (category);
    }
    public QuantitySold quantitySold(){
        return (quantitySold);
    }
}
