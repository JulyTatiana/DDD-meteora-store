package com.example.Meteora.sharedValues;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Category implements ValueObject<String> {

    private final String value;

    public Category(String value){
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public String value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(value, category.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
