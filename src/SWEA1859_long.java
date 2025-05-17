import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SWEA1859_long {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int[] prices = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++) {
                prices[i] = Integer.parseInt(st.nextToken());
            }

            long maxProfit = 0;
            int maxPrice = prices[N - 1];

            for(int i = N - 2; i >= 0; i--) {
                if(prices[i] < maxPrice) {
                    maxProfit += maxPrice - prices[i];
                } else {
                    maxPrice = prices[i];
                }
            }

            System.out.println("#" + test_case + " " + maxProfit);
        }
    }
}
