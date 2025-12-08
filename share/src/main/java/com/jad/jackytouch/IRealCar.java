package com.jad.jackytouch;

public interface IRealCar extends ICar {
    IAsciiAsset getAsciiAsset();

    void setDecoratedCar(IRealCar realCar);
}
