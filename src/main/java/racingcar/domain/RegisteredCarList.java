package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RegisteredCarList {
    private final List<RacingCar> carList;

    public RegisteredCarList() {
        this.carList = new ArrayList<>();
    }

    public void add(RacingCar car) {
        carList.add(car);
    }

    public List<RacingCar> getCarList() {
        return List.copyOf(carList);
    }

}
