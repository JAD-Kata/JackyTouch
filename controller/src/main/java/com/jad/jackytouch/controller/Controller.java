package com.jad.jackytouch.controller;

import com.jad.jackytouch.ICar;
import com.jad.jackytouch.IController;
import com.jad.jackytouch.IModel;
import com.jad.jackytouch.IView;

public class Controller implements IController {
    private final IView view;
    private final IModel model;

    public Controller(final IView view, final IModel model) {
        this.view = view;
        this.model = model;
        this.view.setController(this);
        this.view.setModel(model);
        this.model.setController(this);
        this.model.setView(view);
    }

    @Override
    public void proceed() {
        ICar car = this.model.makeCar();
        System.out.println(car.getDisplay());
        this.model.addNeon(car);
        System.out.println(car.getDisplay());
        this.model.addRims(car);
        System.out.println(car.getDisplay());
        this.model.addExhaust(car);
        System.out.println(car.getDisplay());
        this.model.addSpoiler(car);
        System.out.println(car.getDisplay());
    }
}
