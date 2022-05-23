package com.example.Meteora.salesDirector.commands;

import co.com.sofka.domain.generic.Command;
import com.example.Meteora.salesDirector.values.QuantitySold;
import com.example.Meteora.sharedValues.Category;
import com.example.Meteora.sharedValues.ProductName;

public class AddProductSold extends Command {

    private final Category category;
    private final ProductName productName;
    private final QuantitySold quantitySold;

    public AddProductSold(Category category, ProductName productName, QuantitySold quantitySold) {
        this.category = category;
        this.productName = productName;
        this.quantitySold = quantitySold;
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
