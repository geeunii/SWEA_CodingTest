import java.util.Scanner;

public class SWEA2043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(P - K + 1);

        sc.close();
    }
}
