import java.util.Scanner;

public class SWEA2027 {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(i == j) {
                    System.out.printf("#");
                } else {
                    System.out.printf("+");
                }
            }
            System.out.println();
        }
    }
}
