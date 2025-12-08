package com.jad.jackytouch.model;

import com.jad.jackytouch.IDecoratorSpecification;

public class DecoratorSpecificationShowOff  extends DecoratorSpecification {
    DecoratorSpecificationShowOff() {
        super("ShowOff");
    }

    @Override
    public String getDescription() {
        return "Bruit distinctif";
    }
}
