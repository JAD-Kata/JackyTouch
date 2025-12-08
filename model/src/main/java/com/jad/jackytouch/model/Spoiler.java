package com.jad.jackytouch.model;

import com.jad.jackytouch.ICar;
import org.jetbrains.annotations.NotNull;

class Spoiler extends AbstractCarDecorator {

    static final String ASSET_NAME = "spoiler";

    Spoiler(final @NotNull ICar car) {
        super(car, Spoiler.ASSET_NAME);
    }
}
