package com.jad.jackytouch.model;

import com.jad.jackytouch.ICar;
import com.jad.jackytouch.IDecoratorSpecification;
import com.jad.jackytouch.IRealCar;
import org.jetbrains.annotations.NotNull;

abstract class AbstractCarDecorator implements IRealCar {
    private final AsciiAsset asciiAsset;
    private final String name;
    private IRealCar decoratedCar;
    private IDecoratorSpecification specification = Model.SPECIFICATIONS.getFirst();

    protected AbstractCarDecorator(final @NotNull String name) {
        this.asciiAsset = null;
        this.name = name;
    }

    protected AbstractCarDecorator(final @NotNull ICar car, final @NotNull String name) {
        car.decorate(this);
        this.asciiAsset = AsciiAsset.get(name);
        this.name = name;
    }

    @Override
    public final String getDisplay() {
        return AsciiAsset.getDisplay(this.getAsciiAsset());
    }

    @Override
    public void decorate(final @NotNull IRealCar decorator) {

    }

    @Override
    public String getDescription() {
        final String subDescription = this.decoratedCar.getDescription();
        final String description = this.specification.getDescription();

        return (description.isEmpty() ? subDescription :
                description + (subDescription.isEmpty() ? "" : "\n" + subDescription));
    }

    @Override
    public void changeSpecificationOfTo(final @NotNull String name,
                                        final @NotNull IDecoratorSpecification specification) {
        if (this.is(name)) {
            this.specification = specification;
        } else {
            this.decoratedCar.changeSpecificationOfTo(name, specification);
        }
    }

    @Override
    public String getNames() {
        final String subName = this.decoratedCar.getNames();
        final String name = this.getName();
        return (name.isEmpty() ? subName : name + (subName.isEmpty() ? "" : "\n" + subName));
    }

    @Override
    public final AsciiAsset getAsciiAsset() {
        return AsciiAsset.merge(this.decoratedCar.getAsciiAsset(), this.asciiAsset);
    }

    public void setDecoratedCar(final @NotNull IRealCar realCar) {
        this.decoratedCar = realCar;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean is(final @NotNull String name) {
        return this.name.equals(name);
    }

    public abstract void getDecorator(final @NotNull ICar car);
}
