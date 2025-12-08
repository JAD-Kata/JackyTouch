package com.jad.jackytouch.model;

import com.jad.jackytouch.ICar;
import com.jad.jackytouch.IRealCar;
import org.jetbrains.annotations.NotNull;

abstract class AbstractCarDecorator implements IRealCar {
    private final AsciiAsset asciiAsset;
    protected IRealCar decoratedCar;

    protected AbstractCarDecorator(final @NotNull ICar car, final @NotNull String name) {
        car.decorate(this);
        this.asciiAsset = AsciiAsset.get(name);
    }

    @Override
    public final String getDisplay() {
        return AsciiAsset.getDisplay(this.getAsciiAsset());
    }

    @Override
    public void decorate(final @NotNull IRealCar decorator) {

    }

    @Override
    public final AsciiAsset getAsciiAsset() {
        return AsciiAsset.merge(this.decoratedCar.getAsciiAsset(), this.asciiAsset);
    }

    public void setDecoratedCar(final @NotNull IRealCar realCar) {
        this.decoratedCar = realCar;
    }
}
