package com.example.Meteora.accountant.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalValue implements ValueObject<String> {

    private final String value;

    public TotalValue(String value) {
        this.value = Objects.requireNonNull(value);

        //These are two validations:
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Total Value can't be empty");
        }
        if(this.value.length() >= 30){
            throw new IllegalArgumentException("Total Value must be less than 30 caracteres");
        }
    }

    //@Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalValue that = (TotalValue) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
