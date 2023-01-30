package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;


public class SUBTASK {
    public static int helper(int m, int k, int[] a, int correct) {
        if (a[0] == 0 && a[1] == 0) {
            return 0;
        }
        if (correct == a.length) {
            return 100;
        }
        int c = 0;
            for (int i = 0; i < m; i++) {
                if (a[i] == 0) {
                    c++;
                }
            }
            if (c != 0)
                return 0;
            else
                return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int correct = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1)
                    correct++;
            }
            System.out.println(helper(m, k, a, correct));
            
        }
    }
}
