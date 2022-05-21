package com.example.Meteora.accountant.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AccountantName implements ValueObject<String> {

    private final String value;

    public AccountantName(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The name can't be empty");
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
        AccountantName that = (AccountantName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
