import java.util.Scanner;

public class SWEA1933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {  // i를 1부터 시작하도록 수정
            if(n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}