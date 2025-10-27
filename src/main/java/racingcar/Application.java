package racingcar;

import racingcar.controller.GameManager;
import racingcar.domain.CarMover;
import racingcar.domain.CarRegistration;
import racingcar.domain.WinningJudgment;
import racingcar.domain.generator.NumberGenerator;
import racingcar.domain.generator.RandomNumberGenerator;
import racingcar.service.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        CarRegistration registration = new CarRegistration();
        NumberGenerator generator = new RandomNumberGenerator();
        CarMover mover = new CarMover(generator);
        WinningJudgment judgment = new WinningJudgment();
        RacingGame racingGame = new RacingGame(registration, mover, judgment);
        GameManager gameManager = new GameManager(inputView, outputView, racingGame);

        gameManager.start();
    }
}
