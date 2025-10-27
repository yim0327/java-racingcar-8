package racingcar.controller;

import racingcar.domain.RacingCar;
import racingcar.domain.RegisteredCarList;
import racingcar.service.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameManager {
    private final InputView inputView;
    private final OutputView outputView;
    private final RacingGame racingGame;

    public GameManager(InputView inputView, OutputView outputView, RacingGame racingGame) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.racingGame = racingGame;
    }

    public void start() {
        RegisteredCarList carList =  racingGame.preparateVehicle(inputView.inputCarNames());
        playGame(inputView.inputTryCount(), carList);
    }

    private void playGame(int tryCount, RegisteredCarList carList) {
        outputView.printExecutionResults();
        for (int i = 0; i < tryCount; i++) {
            playTurn(carList);
            System.out.println();
        }

        outputView.printWinners(racingGame.judge(carList));
    }

    private void playTurn(RegisteredCarList carList) {
        for (RacingCar car : carList.getCarList()) {
            racingGame.playRound(car);
            outputView.printGameRecord(car);
        }
    }

}
