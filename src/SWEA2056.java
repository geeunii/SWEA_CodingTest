import java.util.Scanner;

public class SWEA2056 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스 개수 입력 받기
        int T;
        T = sc.nextInt();

        // 테스트 케이스 개수만큼 반복
        for(int test_case = 1; test_case <= T; test_case++) {
            // 각 월의 일수를 저장하는 배열
            // 인덱스를 월과 맞추기 위해 0번 인덱스는 사용하지 않음
            // 1월(31일), 2월(28일), 3월(31일) ... 12월(31일)
            int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            // 8자리 날짜 문자열 입력 받기 (YYYYMMDD 형식)
            String date = sc.next();

            // 년, 월, 일을 추출
            // substring(시작 인덱스, 끝 인덱스)를 사용하여 문자열 분리
            int year = Integer.parseInt(date.substring(0, 4));    // 처음 4자리: 년도
            int month = Integer.parseInt(date.substring(4, 6));   // 다음 2자리: 월
            int day = Integer.parseInt(date.substring(6, 8));     // 마지막 2자리: 일

            // 날짜 유효성 검사를 위한 변수
            boolean isValid = true;

            // 유효성 검사 1: 월이 1~12 사이인지 검사
            if(month < 1 || month > 12) {
                isValid = false;
            } 
            // 유효성 검사 2: 일이 해당 월의 유효한 범위 내인지 검사
            else if(day < 1 || day > daysInMonth[month]) {
                isValid = false;
            }

            // 결과 출력
            // 테스트 케이스 번호 출력
            System.out.print("#" + test_case + " ");
            
            if(isValid) {
                // 유효한 날짜인 경우: YYYY/MM/DD 형식으로 출력
                // %04d: 4자리 정수(빈자리는 0으로 채움)
                // %02d: 2자리 정수(빈자리는 0으로 채움)
                System.out.printf("%04d/%02d/%02d\n", year, month, day);
            } else {
                // 유효하지 않은 날짜인 경우: -1 출력
                System.out.println(-1);
            }
        }

        // Scanner 객체 닫기
        sc.close();
    }
}