import java.util.Scanner;

public class SWEA2058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            // 자연수 N 입력받기
            int N = sc.nextInt();

            // 각 자릿수의 합 계산
            int sum = 0;
            int num = N;

            while (num > 0) {
                sum += num % 10; // 현재 일의 자리 수를 더함
                num /= 10; // 다음 자릿수로 이동
            }

            System.out.println(sum);
        }
        sc.close();
    }
}
