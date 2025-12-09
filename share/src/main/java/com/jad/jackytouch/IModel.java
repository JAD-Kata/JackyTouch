package com.jad.jackytouch;

import org.jetbrains.annotations.NotNull;

public interface IModel {

    ICar makeCar();

    void addDecorator(@NotNull ICar car, @NotNull String decoratorName);

    @NotNull IDecoratorSpecification getSpecification(final @NotNull String randomLight);
}
