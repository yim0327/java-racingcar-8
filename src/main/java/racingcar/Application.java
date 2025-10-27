package racingcar;

import racingcar.controller.GameManager;
import racingcar.domain.CarMover;
import racingcar.domain.CarRegistration;
import racingcar.domain.generator.NumberGenerator;
import racingcar.domain.generator.RandomNumberGenerator;
import racingcar.service.RacingGame;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        CarRegistration carRegistration = new CarRegistration();
        NumberGenerator generator = new RandomNumberGenerator();
        CarMover mover = new CarMover(generator);
        RacingGame racingGame = new RacingGame(carRegistration, mover);
        GameManager gameManager = new GameManager(inputView, racingGame);

        gameManager.start();
    }
}
