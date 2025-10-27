package racingcar.controller;

import racingcar.view.InputView;

public class GameManager {
    private final InputView inputView;

    public GameManager(InputView inputView) {
        this.inputView = inputView;
    }

    public void start() {
        System.out.println(inputView.inputCarNames().toString());
    }

}
