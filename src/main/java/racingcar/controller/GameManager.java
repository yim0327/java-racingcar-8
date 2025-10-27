package racingcar.controller;

import racingcar.service.RacingGame;
import racingcar.view.InputView;

public class GameManager {
    private final InputView inputView;
    private final RacingGame racingGame;

    public GameManager(InputView inputView, RacingGame racingGame) {
        this.inputView = inputView;
        this.racingGame = racingGame;
    }

    public void start() {
        racingGame.preparateVehicle(inputView.inputCarNames());
    }

}
