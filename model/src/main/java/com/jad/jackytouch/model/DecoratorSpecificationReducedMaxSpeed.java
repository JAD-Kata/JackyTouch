package com.jad.jackytouch.model;

public class DecoratorSpecificationReducedMaxSpeed extends DecoratorSpecification {
    DecoratorSpecificationReducedMaxSpeed() {
        super("ReducedMaxSpeed");
    }

    @Override
    public String getDescription() {
        return "Vitesse maximale réduite";
    }
}
