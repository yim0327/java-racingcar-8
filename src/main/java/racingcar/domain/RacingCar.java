package racingcar.domain;

public class RacingCar {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private String carName;
    private int forwardCount;

    private RacingCar(String carName) {
        validateNameLength(carName);
        this.carName = carName;
        this.forwardCount = 0;
    }

    public static RacingCar from(String carName) {
        return new RacingCar(carName);
    }

    private void validateNameLength(String carName) {
        if (carName.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 최대 5자까지만 가능합니다.");
        }
    }
}
