package racingcar.view;

import racingcar.domain.RacingCar;

import java.util.List;

public class OutputView {

    public void printExecutionResults() {
        System.out.println("\n실행 결과");
    }

    public void printGameRecord(RacingCar car) {
        String printBar = car.getCarName() + " : " + "-".repeat(car.getForwardCount());
        System.out.println(printBar);
    }

    public void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }

}
