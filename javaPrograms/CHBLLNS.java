package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class CHBLLNS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            int draws = 0;
            for (int i = 0; i < k; i++) {
                if (k == 1)
                    draws += 1;

                if (r != 0 && g != 0 && b != 0) {
                    draws += 3;
                }
            }
        }
    }
}
