package com.jad.jackytouch;

import org.jetbrains.annotations.NotNull;

public interface IRealCar extends ICar {
    IAsciiAsset getAsciiAsset();

    void setDecoratedCar(IRealCar realCar);

    default String getName() {
        return "";
    }

    default boolean is(final @NotNull String name) {
        return false;
    }

}
