package com.jad.jackytouch;

import org.jetbrains.annotations.NotNull;

public interface ICar {
    String getDisplay();

    void decorate(final @NotNull IRealCar decorator);
}
