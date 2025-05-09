import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int t = 1; t <= T; t++) {
            int sum = 0;
            
            // 10개의 수를 입력받아 홀수인 경우에만 더함
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                if (num % 2 == 1) { // 홀수 체크
                    sum += num;
                }
            }
            
            // 결과 출력
            System.out.println("#" + t + " " + sum);
        }
        
        sc.close();
    }
}