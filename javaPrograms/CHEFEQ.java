package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class CHEFEQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] coins = new int[n];
            for (int i = 0; i < n; i++) {
                coins[i] = sc.nextInt();
            }
            int count = 1, p = 1;
            Arrays.sort(coins);
            for (int i = 0; i < n-1; i++) {
                if(coins[i] == coins[i+1])
                    count++;
                else 
                    count =1;

                p = Math.max(p, count);
            }
            System.out.println(p);
        }
    }
}
/*
 * 1 2 3 4 3
 * 
 * 1 5 8 9
 * 
 * 1 2 2 2 3 4 
 * 
 */
