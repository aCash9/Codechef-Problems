package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class DAILY {
    static int nCr(int n, int r) {
        return fact(n) / (fact(r) *
                fact(n - r));
    }

    // Returns factorial of n
    static int fact(int n) {
        if (n == 0)
            return 1;
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    public static int[] helper(String str, int x) {
        int[] free = new int[9];
        int j = 0;
        for (int i = 0; i < 36; i++) {
            if (str.charAt(i) == '0')
                free[j]++;
            if ((i + 1) % 4 == 0) {
                j++;
            }
        }

        j = 8;
        for (int i = 36; i < 54; i++) {
            if (str.charAt(i) == '0')
                free[j]++;
            if ((i + 1) % 2 == 0) {
                j--;
            }
        }
        return free;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        int ways = 0;
        for (int i = 0; i < n; i++) {
            int[] free = helper(str[i], x);

            for (int j = 0; j < free.length; j++) {
                if (free[j] >= x) {
                    ways += nCr(free[j], x);
                }
            }

        }
        System.out.println(ways);

    }
}
