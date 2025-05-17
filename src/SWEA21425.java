import java.util.Scanner;

public class SWEA21425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();

            int count = 0;

            // A와 B가 N을 넘을 때까지 반복
            while(A <= N && B <= N) {
                if(A < B) {
                    A += B;
                } else {
                    B += A;
                }
                count++;
            }

            System.out.println(count);
        }

        sc.close();
    }
}
