import java.util.Scanner;

public class SWEA1945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        int[] primes = {2, 3, 5, 7, 9}; // 추적할 소수들

        for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // 각 테스트 케이스의 수
            int[] result = new int[5]; // 결과 배열

            for(int i = 0; i < primes.length; i++) {
                while (N % primes[i] == 0) {
                    result[i]++;
                    N /= primes[i];
                }
            }

            System.out.printf("#" + test_case);
            for(int count : result) {
                System.out.print(" " + count);
            }
            System.out.println();
        }

        sc.close();
    }
}
