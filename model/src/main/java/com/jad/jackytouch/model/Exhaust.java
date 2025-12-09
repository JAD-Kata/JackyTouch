package com.jad.jackytouch.model;

import com.jad.jackytouch.ICar;
import org.jetbrains.annotations.NotNull;

class Exhaust extends AbstractCarDecorator {

    static final String ASSET_NAME = "Exhaust";

    Exhaust() {
        super(Exhaust.ASSET_NAME);
    }

    Exhaust(final @NotNull ICar car) {
        super(car, Exhaust.ASSET_NAME);
    }

    @Override
    public void getDecorator(final @NotNull ICar car) {
        new Exhaust(car);
    }
}
