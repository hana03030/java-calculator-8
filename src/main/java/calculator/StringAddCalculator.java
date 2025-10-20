package calculator;

public class StringAddCalculator {

    private static final String DEFAULT_DELIMITERS = ",|:"; // 기본 구분자 (쉼표, 콜론)

    public static int splitAndSum(String input) {
        // 입력이 비어 있으면 0 변환
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // 1. 기본 구분자(. 또는 :) 기준으로 문자열 분리
        String[] numbers = input.split(DEFAULT_DELIMITERS);

        // 2. 각 문자열을 숫자로 변환 후 합산
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}
