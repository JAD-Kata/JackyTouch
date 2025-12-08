package com.jad.jackytouch.model;

import com.jad.jackytouch.IDecoratorSpecification;

public class DecoratorSpecificationSilent  extends DecoratorSpecification {
    DecoratorSpecificationSilent() {
        super("Silent");
    }

    @Override
    public String getDescription() {
        return "Silencieux";
    }
}
