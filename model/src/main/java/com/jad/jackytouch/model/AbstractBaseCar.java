package com.jad.jackytouch.model;

import com.jad.jackytouch.IRealCar;
import org.jetbrains.annotations.NotNull;

abstract class AbstractBaseCar implements IRealCar {
    private final AsciiAsset asciiAsset;

    AbstractBaseCar(final @NotNull String name) {
        this.asciiAsset = AsciiAsset.get(name);
    }

    @Override
    public String getDisplay() {
        return AsciiAsset.getDisplay(this.getAsciiAsset());
    }

    @Override
    public void decorate(final @NotNull IRealCar decorator) {

    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public AsciiAsset getAsciiAsset() {
        return this.asciiAsset;
    }

    @Override
    public void setDecoratedCar(final IRealCar realCar) {

    }
}
