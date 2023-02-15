package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class KPAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int diff = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n / 2; i++) {
                int n1 = a[i];
                int n2 = a[n - 1 - i];
                if (n1 != n2) {
                    diff = Math.max(Math.abs(n1 - n2),diff);  
                }
            }
            if(diff <= k)
                System.out.println("Yes");
            else 
                System.out.println("No");
        }
    }
}
