package com.jad.jackytouch;

import org.jetbrains.annotations.NotNull;

public interface IView {
    void display(@NotNull String message);

    void displayCar(ICar car);
}
