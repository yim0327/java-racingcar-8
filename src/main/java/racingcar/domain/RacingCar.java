package racingcar.domain;

public class RacingCar {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private String carName;
    private int forwardCount;

    private RacingCar(String carName) {
        validateNameLength(carName);
        validateNotBlankCarName(carName);
        this.carName = carName;
        this.forwardCount = 0;
    }

    public static RacingCar from(String carName) {
        return new RacingCar(carName);
    }

    public void move() {
        forwardCount++;
    }

    public String getCarName() {
        return carName;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    private void validateNameLength(String carName) {
        if (carName.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 최대 5자까지만 가능합니다.");
        }
    }

    private void validateNotBlankCarName(String carName) {
        if (carName.trim().isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 비어 있을 수 없습니다.");
        }
    }

}
