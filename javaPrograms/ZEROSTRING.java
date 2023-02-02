package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class ZEROSTRING {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int n0 = 0, n1 = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '1')
                    n1++;
                else
                    n0++;
            }
            if (n1 == 0 || n0 == n) {
                System.out.println(0);
                continue;
            }
            if (n1 == n) {
                System.out.println(1);
                continue;
            }
            if (n1 == n0) {
                System.out.println(n0);
                continue;
            }
            if (n1 < n0) {
                System.out.println(n1);
            } else {
                System.out.println(n0+1);
            }
        }
    }
}
