package com.jad.jackytouch.model;

public class DecoratorSpecificationRandomLight extends DecoratorSpecification {
    DecoratorSpecificationRandomLight() {
        super("RandomLight");
    }

    @Override
    public String getDescription() {
        return "Lumières aléatoires";
    }
}
