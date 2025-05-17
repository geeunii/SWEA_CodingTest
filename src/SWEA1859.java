import java.util.Scanner;

public class SWEA1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            // N: 매매가의 일 수
            int N = sc.nextInt();

            // 매매가 배열
            int[] prices = new int[N];
            for(int i = 0; i < N; i++) {
                prices[i] = sc.nextInt();
            }

            // 최대 이익을 얻기 위한 알고리즘
            int maxProfit = 0;
            int maxPrice = prices[N - 1]; // 마지막 날의 가격을 최대로 시작

            // 뒤에서부터 확인
            for(int i = N - 2; i >= 0; i--) {
                if(prices[i] < maxPrice) {
                    // 매수하고 팔아서 이익을 계산
                    maxProfit += maxPrice - prices[i];
                } else {
                    // 가장 높은 가격 갱신
                    maxPrice = prices[i];
                }
            }

            System.out.println("#" + test_case + " " + maxProfit);
        }

        sc.close();
    }
}
