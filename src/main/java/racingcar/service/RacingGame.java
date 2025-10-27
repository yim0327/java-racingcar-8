package racingcar.service;

import racingcar.domain.*;

import java.util.List;

public class RacingGame {
    private final CarRegistration carRegistration;
    private final CarMover carMover;
    private final WinningJudgment winningJudgment;

    public RacingGame(CarRegistration carRegistration, CarMover carMover, WinningJudgment winningJudgment) {
        this.carRegistration = carRegistration;
        this.carMover = carMover;
        this.winningJudgment = winningJudgment;
    }

    public RegisteredCarList preparateVehicle(List<String> carNames) {
        return carRegistration.registrate(carNames);
    }

    public void playRound(RacingCar car) {
        carMover.playTurn(car);
    }

    public List<String> judge(RegisteredCarList registeredCarList) {
        return winningJudgment.judge(registeredCarList.getCarList());
    }

}
