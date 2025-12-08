package com.jad.jackytouch.model;

public class DecoratorSpecificationSilent extends DecoratorSpecification {
    DecoratorSpecificationSilent() {
        super("Silent");
    }

    @Override
    public String getDescription() {
        return "Silencieux";
    }
}
