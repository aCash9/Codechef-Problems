package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class NOBEL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] tp = new int[n];
            int[] count = new int[m];
            Arrays.fill(count, -1);
            for (int i = 0; i < n; i++) {
                tp[i] = sc.nextInt();
                count[tp[i]-1]++;
            }
            int c = 0;
            for( int i : count){
                if(i == -1){
                    System.out.println("Yes");c++;
                    break;
                }
            }
            if(c == 0)
                System.out.println("No");
        }
    }
}