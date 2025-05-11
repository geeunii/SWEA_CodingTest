import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            // N 입력 받기
            int N = sc.nextInt();
            
            // N개의 점수를 저장할 배열 생성
            int[] scores = new int[N];

            // N개의 점수 입력 받기
            for(int i = 0; i < N; i++) {
                scores[i] = sc.nextInt();
            }
            
            // 배열 정렬
            Arrays.sort(scores);
            
            // 중간값 찾기 (N은 홀수이므로 N/2 위치가 중간값)
            int median = scores[N/2];
            
            // 결과 출력
            System.out.println("#" + test_case + " " + median);
        }
        
        sc.close();
    }
}