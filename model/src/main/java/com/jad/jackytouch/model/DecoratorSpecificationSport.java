package com.jad.jackytouch.model;

import com.jad.jackytouch.IDecoratorSpecification;

public class DecoratorSpecificationSport  extends DecoratorSpecification {
    DecoratorSpecificationSport() {
        super("Sport");
    }

    @Override
    public String getDescription() {
        return "Bruit puissant";
    }
}
