package com.jad.jackytouch.model;

public class DecoratorSpecificationFixedLight extends DecoratorSpecification {
    DecoratorSpecificationFixedLight() {
        super("FixedLight");
    }

    @Override
    public String getDescription() {
        return "Lumières fixes";
    }
}
