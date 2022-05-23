package com.example.Meteora.logisticsCoordinator.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DeliveryDate implements ValueObject<String> {

    private final String value;

    public DeliveryDate(String value) {
        this.value = Objects.requireNonNull(value);
    }

    //@Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryDate that = (DeliveryDate) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
