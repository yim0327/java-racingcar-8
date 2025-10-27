package racingcar;

import racingcar.controller.GameManager;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        GameManager gameManager = new GameManager(inputView);

        gameManager.start();
    }
}
