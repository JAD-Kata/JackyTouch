package com.jad.jackytouch.model;

import com.jad.jackytouch.ICar;
import org.jetbrains.annotations.NotNull;

class Neon extends AbstractCarDecorator {

    static final String ASSET_NAME = "neon";

    Neon(final @NotNull ICar car) {
        super(car, Neon.ASSET_NAME);
    }
}
