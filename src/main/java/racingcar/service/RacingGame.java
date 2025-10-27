package racingcar.service;

import racingcar.domain.CarMover;
import racingcar.domain.CarRegistration;
import racingcar.domain.RacingCar;
import racingcar.domain.RegisteredCarList;

import java.util.List;

public class RacingGame {
    private CarRegistration carRegistration;
    private CarMover carMover;

    public RacingGame(CarRegistration carRegistration, CarMover carMover) {
        this.carRegistration = carRegistration;
        this.carMover = carMover;
    }

    public RegisteredCarList preparateVehicle(List<String> carNames) {
        return carRegistration.registrate(carNames);
    }

    public void playRound(RacingCar car) {
        carMover.playTurn(car);
    }

}
