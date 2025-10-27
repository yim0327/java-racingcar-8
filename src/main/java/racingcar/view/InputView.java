package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public List<String> inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        List<String> carNames = Arrays.stream(Console.readLine().split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        validateNonEmptyList(carNames);
        return carNames;
    }

    public int inputTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String tryCount = Console.readLine();
        validateTryCount(tryCount);
        return Integer.parseInt(tryCount);
    }

    private void validateNonEmptyList(List<String> input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("적어도 하나의 자동차를 입력해야 합니다.");
        }
    }

    private void validateTryCount(String input) {
        validateNotBlank(input);
        validateIsNumeric(input);

        int tryCount = Integer.parseInt(input);
        if (tryCount <= 0) {
            throw new IllegalArgumentException("시도 횟수는 최소 1 이상이어야 합니다.");
        }
    }

    private void validateNotBlank(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("입력값은 비어 있거나 공백일 수 없습니다.");
        }
    }

    private void validateIsNumeric(String input) {
        if (!input.matches("[0-9]+")) {
            throw new IllegalArgumentException("오직 숫자만 입력 가능합니다");
        }
    }

}
