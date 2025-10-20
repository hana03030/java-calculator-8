package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    private static final String DEFAULT_DELIMITERS = ",|:"; // 기본 구분자 (쉼표, 콜론)

    public static int splitAndSum(String input) {
        // 입력이 비어 있으면 0 변환
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // 1. 커스텀 구분자 패턴 확인 (정규식)
        Matcher matcher = Pattern.compile("//(.)\\\\n(.*)").matcher(input);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1); // 예: ;
            String numbers = matcher.group(2); // 예: 1;2;3
            return sum(numbers.split(customDelimiter));
        }

        // 2. 기본 구분자 처리
        return sum(input.split(DEFAULT_DELIMITERS));
    }

    private static int sum(String[] numbers) {
        int result = 0;
        for (String number : numbers) {
            result += Integer.parseInt(number);
        }
        return result;
    }
}
