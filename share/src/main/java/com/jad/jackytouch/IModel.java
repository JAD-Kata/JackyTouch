package com.jad.jackytouch;

import org.jetbrains.annotations.NotNull;

public interface IModel {
    void setController(final @NotNull IController controller);

    void setView(final @NotNull IView view);

    ICar makeCar();

    void addSpoiler(@NotNull ICar car);

    void addNeon(@NotNull ICar car);

    void addRims(@NotNull ICar car);

    void addExhaust(@NotNull ICar car);

    @NotNull IDecoratorSpecification getSpecification(final @NotNull String randomLight);
}
