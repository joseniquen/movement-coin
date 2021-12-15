package com.example.monederomovementmicroservice.utils;

public enum ProductType {
    MONEDERO_MOVIL("MONEDERO");

    public final String value;

    @Override
    public String toString() {
        return value;
    }

    public boolean equalsName(String otherValue) {
        return value.equals(otherValue);
    }

    private ProductType(String value) {
        this.value = value;
    }
}
