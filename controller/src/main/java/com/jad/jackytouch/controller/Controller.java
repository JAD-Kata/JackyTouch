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
        this.view.display(car.getDisplay() + "\n" + car.getDescription());
        this.model.addNeon(car);
        this.view.display(car.getDisplay() + "\n" + car.getDescription());
        this.model.addRims(car);
        this.view.display(car.getDisplay() + "\n" + car.getDescription());
        this.model.addExhaust(car);
        this.view.display(car.getDisplay() + "\n" + car.getDescription());
        this.model.addSpoiler(car);
        this.view.display(car.getDisplay() + "\n" + car.getDescription());

        car.changeSpecificationOfTo("Neon", this.model.getSpecification("RandomLight"));
        car.changeSpecificationOfTo("Exhaust", this.model.getSpecification("Sport"));
        car.changeSpecificationOfTo("Rims", this.model.getSpecification("AccelerationImproved"));
        car.changeSpecificationOfTo("Spoiler", this.model.getSpecification("ReducedMaxSpeed"));
        this.view.display(car.getDisplay() + "\n" + car.getDescription());
    }
}
