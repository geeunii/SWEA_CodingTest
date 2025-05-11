import java.util.Scanner;  // Scanner 클래스를 사용하기 위한 import

public class Main {
    public static void main(String[] args) {
        // 1. Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        // System.in은 표준 입력(키보드 입력)을 의미합니다.
        
        // 2. 정수 입력 받기
        int T = sc.nextInt(); // nextInt()는 다음 정수를 읽어옵니다.
        
        // 3. 테스트 케이스 처리
        for (int t = 1; t <= T; t++) {
            int sum = 0;
            
            // 4. 10개의 숫자 입력 받기
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt(); // 각각의 정수를 입력받음
                if (num % 2 == 1) {
                    sum += num;
                }
            }
            
            System.out.println("#" + t + " " + sum);
        }
        
        // 5. Scanner 닫기
        sc.close(); // 리소스 누수 방지를 위해 Scanner를 닫아줍니다.
    }
}