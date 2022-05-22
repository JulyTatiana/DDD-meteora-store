package com.example.Meteora.salesDirector.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CustomerAddress implements ValueObject<String> {

    private final String value;

    public CustomerAddress(String value){

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
        CustomerAddress that = (CustomerAddress) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}