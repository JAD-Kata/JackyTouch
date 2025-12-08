package com.jad.jackytouch.model;

public class DecoratorSpecificationSimulatedFlashing extends DecoratorSpecification {
    DecoratorSpecificationSimulatedFlashing() {
        super("SimulatedFlashing");
    }

    @Override
    public String getDescription() {
        return "Clignotement simulé";
    }
}
