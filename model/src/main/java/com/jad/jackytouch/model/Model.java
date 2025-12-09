package com.jad.jackytouch.model;

import com.jad.jackytouch.ICar;
import com.jad.jackytouch.IDecoratorSpecification;
import com.jad.jackytouch.IModel;
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
    final static List<AbstractCarDecorator> DECORATORS = List.of(
            new Spoiler(),
            new Neon(),
            new Rims(),
            new Exhaust()
                                                                );

    @Override
    public ICar makeCar() {
        return new Car();
    }

    @Override
    public void addDecorator(final @NotNull ICar car, final @NotNull String decoratorName) {
        for (final AbstractCarDecorator decorator : Model.DECORATORS) {
            if (decorator.is(decoratorName)) {
                decorator.getDecorator(car);
                return;
            }
        }
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
