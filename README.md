# java-calculator-precourse

# 문자열 덧셈 계산기 (String Add Calculator)

## 미션 개요
입력한 문자열에서 숫자를 추출하여 더하는 계산기를 구현합니다.  
쉼표(,) 또는 콜론(:)으로 구분된 문자열을 더하거나,   
커스텀 구분자를 지정하여 계산할 수 있습니다.

---

## 기능 요구사항

### 기본 기능
- 빈 문자열 입력 시 0을 반환한다.
  - 예: `"" → 0`
- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열의 각 숫자를 더한다.
  - 예: `"1,2"` → 3  
  - 예: `"1,2:3"` → 6

### 커스텀 구분자
- 문자열 앞부분의 `"//"`와 `"\n"` 사이 문자를 커스텀 구분자로 사용한다.
  - 예: `"//;\n1;2;3"` → 구분자 `;`, 결과 6 반환

### 예외 처리
- 숫자 이외의 값이 포함되면 `IllegalArgumentException` 발생
- 음수가 포함된 경우에도 `IllegalArgumentException` 발생
  - 예: `"-1,2,3"` → 예외 발생 후 프로그램 종료

### 출력 형식
- 결과를 `"결과 : X"` 형태로 출력한다.

---

## 기능 목록

- [ ] `camp.nextstep.edu.missionutils.Console.readLine()`을 사용하여 사용자 입력 받기  
- [ ] "덧셈할 문자열을 입력해 주세요." 출력하기  
- [ ] 입력이 비어 있을 경우 0을 반환하는 로직 구현  
- [ ] 쉼표(,) 또는 콜론(:)을 구분자로 하여 숫자 분리 및 합산  
- [ ] 커스텀 구분자("//;\n") 형식 파싱 기능 구현  
- [ ] 분리된 문자열을 숫자로 변환하여 합산  
- [ ] 음수 입력 시 `IllegalArgumentException` 발생  
- [ ] 결과를 `"결과 : X"` 형태로 출력  
- [ ] 계산 로직을 별도 클래스(`StringAddCalculator`)로 분리  
- [ ] 입력/출력/계산 책임 분리 (SRP 원칙 반영)

---

## 예시 입출력

| 입력 | 출력 |
|------|------|
| `""` | `결과 : 0` |
| `"1,2,3"` | `결과 : 6` |
| `"1,2:3"` | `결과 : 6` |
| `"//;\n1;2;3"` | `결과 : 6` |
| `"-1,2,3"` | `IllegalArgumentException 발생` |

---

##  실행 예시
덧셈할 문자열을 입력해 주세요.  
1,2:3  
결과 : 6

---

## 패키지 구조 예시
src  
 ├── main  
 │   └── java  
 │       └── calculator  
 │            ├── Application.java  
 │            └── StringAddCalculator.java  
 └── test  
 │   └── java  
 │       └── calculator  
 │           └── ApplicationTest.java  

---

## 커밋 컨벤션

| 타입 | 설명 |
|------|------|
| **feat** | 새로운 기능 추가 |
| **fix** | 버그 수정 |
| **docs** | 문서 수정 (README 등) |
| **style** | 코드 포맷, 세미콜론 등 비기능 변경 |
| **refactor** | 기능 변화 없는 리팩토링 |
| **test** | 테스트 코드 추가/수정 |
| **chore** | 빌드, 설정 등 유지보수 작업 |

### 예시
docs(readme): add feature list for string calculator  
feat(parser): implement custom delimiter support  
fix(validation): throw exception when input contains negative number  

---

## 참고
- `camp.nextstep.edu.missionutils.Console` API를 사용해야 함
- `System.exit()` 호출 금지
- JDK 21 환경에서 실행 가능해야 함
- 제공된 `build.gradle` 변경 금지
- 자바 코드 컨벤션 준수 (Java Style Guide 원칙)
