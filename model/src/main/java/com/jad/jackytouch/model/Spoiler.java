package com.jad.jackytouch.model;

import com.jad.jackytouch.ICar;
import org.jetbrains.annotations.NotNull;

class Spoiler extends AbstractCarDecorator {

    static final String ASSET_NAME = "Spoiler";

    Spoiler() {
        super(Spoiler.ASSET_NAME);
    }

    Spoiler(final @NotNull ICar car) {
        super(car, Spoiler.ASSET_NAME);
    }

    @Override
    public void getDecorator(final @NotNull ICar car) {
        new Spoiler(car);
    }
}
