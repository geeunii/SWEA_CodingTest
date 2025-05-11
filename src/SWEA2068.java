import java.util.Scanner;
import java.io.FileInputStream;

public class SWEA2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt(); // 테스트 케이스 개수

        for(int test_case = 1; test_case <= T; test_case++) {
            // 최댓값을 저장할 변수 초기화
            int max = 0; // 0 이상의 정수이므로 0으로 초기화 가능.

            // 10개의 수를 입력받으면서 최댓값 찾기
            for(int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                if(num > max) {
                    max = num;
                }
            }

            System.out.println("#" + test_case + " " + max);
        }

        sc.close();
    }
}
