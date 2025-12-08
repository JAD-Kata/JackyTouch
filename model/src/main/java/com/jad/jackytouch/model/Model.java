package com.jad.jackytouch.model;

import com.jad.jackytouch.ICar;
import com.jad.jackytouch.IController;
import com.jad.jackytouch.IModel;
import com.jad.jackytouch.IView;
import org.jetbrains.annotations.NotNull;

public class Model implements IModel {
    private IController controller;
    private IView view;

    @Override
    public void setController(final @NotNull IController controller) {
        this.controller = controller;
    }

    @Override
    public void setView(final @NotNull IView view) {
        this.view = view;
    }

    @Override
    public ICar makeCar() {
        return new Car();
    }

    @Override
    public void addSpoiler(final @NotNull ICar car) {
        new Spoiler(car);
    }

    @Override
    public void addNeon(final @NotNull ICar car) {
        new Neon(car);
    }

    @Override
    public void addRims(final @NotNull ICar car) {
        new Rims(car);
    }

    @Override
    public void addExhaust(final @NotNull ICar car) {
        new Exhaust(car);
    }

}
