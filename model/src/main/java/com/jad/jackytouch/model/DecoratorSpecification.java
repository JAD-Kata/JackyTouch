package com.jad.jackytouch.model;

import com.jad.jackytouch.IDecoratorSpecification;
import org.jetbrains.annotations.NotNull;

abstract class DecoratorSpecification implements IDecoratorSpecification {
    private final String name;

    DecoratorSpecification(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean is(final @NotNull String name) {
        return this.name.equals(name);
    }
}
