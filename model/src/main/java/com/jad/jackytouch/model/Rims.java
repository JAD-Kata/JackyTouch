package com.jad.jackytouch.model;

import com.jad.jackytouch.ICar;
import org.jetbrains.annotations.NotNull;

class Rims extends AbstractCarDecorator {

    static final String ASSET_NAME = "rims";

    Rims(final @NotNull ICar car) {
        super(car, Rims.ASSET_NAME);
    }
}
