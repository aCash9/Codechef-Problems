package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class MAKEARRAYODD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            int even = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 == 0)
                    even++;
            }
            if (even == n) {
                if (x % 2 != 0)
                    System.out.println(even % 2 == 0 ? even / 2 : (even / 2) + 1);
                else
                    System.out.println(-1);
            } else if (x % 2 != 0) {
                System.out.println(even % 2 == 0 ? even / 2 : (even / 2) + 1);
            } else
                System.out.println(even);
        }
    }
}
