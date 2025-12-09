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
        this.view.displayCar(car);
        this.model.addDecorator(car, "Neon");
        this.view.displayCar(car);
        this.model.addDecorator(car, "Rims");
        this.view.displayCar(car);
        this.model.addDecorator(car, "Exhaust");
        this.view.displayCar(car);
        this.model.addDecorator(car, "Spoiler");
        this.view.displayCar(car);

        car.changeSpecificationOfTo("Neon", this.model.getSpecification("RandomLight"));
        this.view.displayCar(car);
        car.changeSpecificationOfTo("Exhaust", this.model.getSpecification("Sport"));
        this.view.displayCar(car);
        car.changeSpecificationOfTo("Rims", this.model.getSpecification("AccelerationImproved"));
        this.view.displayCar(car);
        car.changeSpecificationOfTo("Spoiler", this.model.getSpecification("ReducedMaxSpeed"));
        this.view.displayCar(car);
    }
}
