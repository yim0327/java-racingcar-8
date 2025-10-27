package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class WinningJudgment {

    public List<String> judge(List<RacingCar> carList) {
        int topRank = 0;

        for (RacingCar car : carList)
            if (topRank < car.getForwardCount()) { topRank = car.getForwardCount(); }

        List<String> winners = new ArrayList<>();

        for (RacingCar car : carList)
            if (topRank == car.getForwardCount()) { winners.add(car.getCarName()); }

        return winners;
    }

}
