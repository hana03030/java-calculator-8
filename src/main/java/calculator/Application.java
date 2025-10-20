package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // 1. 사용자에게 입력 요청
        System.out.println("덧셈할 문자열을 입력해 주세요.");

        // 2. 문자열 입력 받기
        String input = Console.readLine();

        // 다음 단계에서 input을 계산기로 넘길 예정
        System.out.println("입력값: " + input);
    }
}
