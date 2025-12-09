package com.jad.jackytouch;

import org.jetbrains.annotations.NotNull;

public interface IModel {
    void setController(final @NotNull IController controller);

    void setView(final @NotNull IView view);

    ICar makeCar();

    void addDecorator(@NotNull ICar car, @NotNull String decoratorName);

    @NotNull IDecoratorSpecification getSpecification(final @NotNull String randomLight);
}
