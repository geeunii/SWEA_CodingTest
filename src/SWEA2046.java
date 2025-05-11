import java.util.Scanner;

public class SWEA2046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num <= 100000) {
            for(int i = 0; i < num; i++) {
                System.out.printf("#");
            }
        } else {
            System.out.println("10만 이하의 숫자만 입력하시오");
        }

        sc.close();
    }
}
