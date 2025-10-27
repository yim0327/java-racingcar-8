package racingcar.service;

import racingcar.domain.CarRegistration;
import racingcar.domain.RegisteredCarList;

import java.util.List;

public class RacingGame {
    private CarRegistration carRegistration;

    public RacingGame(CarRegistration carRegistration) {
        this.carRegistration = carRegistration;
    }

    public RegisteredCarList preparateVehicle(List<String> carNames) {
        return carRegistration.registrate(carNames);
    }
}
