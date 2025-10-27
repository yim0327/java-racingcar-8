package racingcar.domain;

import java.util.List;

public class CarRegistration {
    private final RegisteredCarList registeredCarList;

    public CarRegistration() {
        this.registeredCarList = new RegisteredCarList();
    }

    public RegisteredCarList registrate(List<String> CarNames) {
        for (String carName : CarNames) {
            registeredCarList.add(RacingCar.from(carName));
        }

        return registeredCarList;
    }
}
