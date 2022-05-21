package com.example.Meteora.accountant.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PaymentDate implements ValueObject<String> {

    private final String value;

    public PaymentDate(String value) {
        this.value = Objects.requireNonNull(value);

        //These are two validations:
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Payment Date can't be empty");
        }
        if(this.value.length() <= 4){
            throw new IllegalArgumentException("Payment Date should have at least 4 caracteres");
        }
        if(this.value.length() >= 30){
            throw new IllegalArgumentException("Payment Date must be less than 30 caracteres");
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
        PaymentDate that = (PaymentDate) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
