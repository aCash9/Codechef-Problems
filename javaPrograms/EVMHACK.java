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
            
            int votes = a + b + c + Math.max(p-a,Math.max(q-b, r-c));

            if (votes > half)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
