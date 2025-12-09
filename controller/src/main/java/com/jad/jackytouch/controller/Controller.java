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
    }

    @Override
    public void proceed() {
        ICar car = this.model.makeCar();
        this.view.displayCar(car);

        this.addAllTuning(car);

        this.changeSpecification(car);
    }

    private void addAllTuning(final ICar car) {
        String[] tunings = {"Neon", "Rims", "Exhaust", "Spoiler"};
        for (String tuning : tunings) {
            this.model.addDecorator(car, tuning);
            this.view.displayCar(car);
        }
    }

    private void changeSpecification(final ICar car) {
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
