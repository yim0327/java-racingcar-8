package racingcar;

import racingcar.controller.GameManager;
import racingcar.domain.CarRegistration;
import racingcar.service.RacingGame;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        CarRegistration carRegistration = new CarRegistration();
        RacingGame racingGame = new RacingGame(carRegistration);
        GameManager gameManager = new GameManager(inputView, racingGame);

        gameManager.start();
    }
}
