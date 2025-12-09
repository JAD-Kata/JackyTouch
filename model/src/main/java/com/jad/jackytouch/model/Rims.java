package com.jad.jackytouch.model;

import com.jad.jackytouch.ICar;
import org.jetbrains.annotations.NotNull;

class Rims extends AbstractCarDecorator {

    static final String ASSET_NAME = "Rims";

    Rims() {
        super(Rims.ASSET_NAME);
    }

    Rims(final @NotNull ICar car) {
        super(car, Rims.ASSET_NAME);
    }

    @Override
    public void getDecorator(final @NotNull ICar car) {
        new Rims(car);
    }
}
