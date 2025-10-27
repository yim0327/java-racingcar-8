package racingcar.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarRegistration {
    private final RegisteredCarList registeredCarList;

    public CarRegistration() {
        this.registeredCarList = new RegisteredCarList();
    }

    public RegisteredCarList registrate(List<String> CarNames) {
        validateDuplicate(CarNames);

        for (String carName : CarNames) {
            registeredCarList.add(RacingCar.from(carName));
        }

        return registeredCarList;
    }

    private void validateDuplicate(List<String> CarNames) {
        Set<String> uniqueNames = new HashSet<>();

        for (String name : CarNames) {
            if (!uniqueNames.add(name.trim())) {
                throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
            }
        }
    }

}
