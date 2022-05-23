package com.example.Meteora.salesDirector.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.salesDirector.values.ProductID;
import com.example.Meteora.salesDirector.values.QuantitySold;
import com.example.Meteora.sharedValues.Category;
import com.example.Meteora.sharedValues.ProductName;

public class UpdateCategoryOfProductSold extends Command {

    private final ProductID productID;
    private final Category category;
    private final ProductName productName;
    private final QuantitySold quantitySold;

    public UpdateCategoryOfProductSold(ProductID productID, Category category, ProductName productName, QuantitySold quantitySold) {
        this.productID = productID;
        this.category = category;
        this.productName = productName;
        this.quantitySold = quantitySold;
    }

    public ProductID getProductID() {
        return productID;
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
}
