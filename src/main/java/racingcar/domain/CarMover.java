package racingcar.domain;

import racingcar.domain.generator.NumberGenerator;

public class CarMover {
    private static final int REFERENCE_POINT = 4;
    private final NumberGenerator generator;

    public CarMover(NumberGenerator generator) {
        this.generator = generator;
    }

    public void playTurn(RacingCar car) {
        int number = generator.generate();
        if (number >= REFERENCE_POINT) { car.move(); }
    }
}
