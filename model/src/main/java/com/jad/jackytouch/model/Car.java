package com.jad.jackytouch.model;

import com.jad.jackytouch.ICar;
import com.jad.jackytouch.IDecoratorSpecification;
import com.jad.jackytouch.IRealCar;
import org.jetbrains.annotations.NotNull;

class Car implements ICar {
    private IRealCar realCar;

    public Car() {
        this.realCar = new BaseCar();
    }

    @Override
    public String getDisplay() {
        return this.realCar.getDisplay();
    }

    @Override
    public void decorate(final @NotNull IRealCar decorator) {
        decorator.setDecoratedCar(this.realCar);
        this.realCar = decorator;
    }

    @Override
    public String getDescription() {
        return this.realCar.getDescription();
    }

    @Override
    public void changeSpecificationOfTo(final @NotNull String name,
                                        final @NotNull IDecoratorSpecification specification) {
        this.realCar.changeSpecificationOfTo(name, specification);
    }
}
