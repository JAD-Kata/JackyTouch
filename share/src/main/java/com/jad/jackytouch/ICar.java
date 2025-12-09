package com.jad.jackytouch;

import org.jetbrains.annotations.NotNull;

public interface ICar {
    String getDisplay();

    void decorate(final @NotNull IRealCar decorator);

    String getDescription();

    default void changeSpecificationOfTo(final @NotNull String name,
                                         final @NotNull IDecoratorSpecification specification) {

    }

    String getNames();
}