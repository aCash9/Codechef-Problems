package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class EVMHACK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();

            int half = (p + q + r) / 2;

            int intial = a + b + c;

            if (intial > half) {
                System.out.println("Yes");
                continue;
            }
            int min, max;
            if (p > q && p > r) {
                min = a;
                max = p;
            } else if (q > r) {
                min = b;
                max = q;
            } else {
                min = c;
                max = r;
            }

            int votes = a + b + c + max - min;

            if (votes > half)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
