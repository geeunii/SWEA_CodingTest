import java.util.Scanner;
import java.util.*;

import static javax.xml.crypto.dsig.Transform.BASE64;

public class SWEA1928 {
    static final String BASE64_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());

        for(int test_case = 1; test_case <= T; test_case++) {
            String encoded = sc.nextLine();
            StringBuilder binary = new StringBuilder();

            for(char ch : encoded.toCharArray()) {
                int val = BASE64_CHARS.indexOf(ch);
                String bin = String.format("%6s", Integer.toBinaryString(val)).replace(' ', '0');
                binary.append(bin);
            }

            StringBuilder decoded = new StringBuilder();
            for(int i = 0; i < binary.length(); i += 8) {
                if(i + 8 > binary.length()) break;
                String byteStr = binary.substring(i, i + 8);
                int charCode = Integer.parseInt(byteStr, 2);
                decoded.append((char) charCode);
            }

            System.out.println("#" + test_case + " " + decoded.toString());
        }

        sc.close();
    }
}
