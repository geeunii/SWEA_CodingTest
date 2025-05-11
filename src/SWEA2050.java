import java.util.Scanner;

public class SWEA2050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++) {
            String input = sc.nextLine().toLowerCase();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    int num = ch - 'a' + 1;
                    result.append(num).append(" ");
                }
            }

            System.out.println(result.toString().trim());
        }
        sc.close();
    }
}
