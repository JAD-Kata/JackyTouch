package com.jad.jackytouch;

import org.jetbrains.annotations.NotNull;

public interface IDecoratorSpecification {
    String getName();

    boolean is(final @NotNull String name);

    String getDescription();
}
