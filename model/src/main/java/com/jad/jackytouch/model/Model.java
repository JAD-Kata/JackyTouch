package com.jad.jackytouch.model;

import com.jad.jackytouch.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Model implements IModel {
    final static List<DecoratorSpecification> SPECIFICATIONS = List.of(
            new DecoratorSpecificationNoEffect(),
            new DecoratorSpecificationDrag(),
            new DecoratorSpecificationFixedLight(),
            new DecoratorSpecificationImprovedAcceleration(),
            new DecoratorSpecificationRandomLight(),
            new DecoratorSpecificationReducedMaxSpeed(),
            new DecoratorSpecificationShowOff(),
            new DecoratorSpecificationSilent(),
            new DecoratorSpecificationSimulatedFlashing(),
            new DecoratorSpecificationSport(),
            new DecoratorSpecificationStabilityIncrease()
                                                                              );
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

    @Override
    public @NotNull IDecoratorSpecification getSpecification(final @NotNull String randomLight) {
        for (final DecoratorSpecification specification : Model.SPECIFICATIONS) {
            if (specification.getName().equals(randomLight)) {
                return specification;
            }
        }
        return Model.SPECIFICATIONS.getFirst();
    }

}
