package com.jad.jackytouch.model;

import com.jad.jackytouch.IDecoratorSpecification;

public class DecoratorSpecificationSimulatedFlashing  extends DecoratorSpecification {
    DecoratorSpecificationSimulatedFlashing() {
        super("SimulatedFlashing");
    }

    @Override
    public String getDescription() {
        return "Clignotement simulé";
    }
}
