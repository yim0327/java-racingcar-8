package racingcar.controller;

import racingcar.service.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameManager {
    private final InputView inputView;
    private final OutputView outputView;
    private final RacingGame racingGame;

    public GameManager(InputView inputView, OutputView outputView, RacingGame racingGame) {
        this.inputView = inputView;
        this.racingGame = racingGame;
        this.outputView = outputView;
    }

    public void start() {
        racingGame.preparateVehicle(inputView.inputCarNames());
    }

}
