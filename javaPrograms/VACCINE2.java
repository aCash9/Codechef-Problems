package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class VACCINE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] age = new int[n];
            int risk = 0, norisk = 0;
            for (int i = 0; i < n; i++) {
                age[i] = sc.nextInt();
                if (age[i] >= 80 || age[i] <= 9)
                    risk++;
                else
                    norisk++;
            }
            if (d == 1) {
                System.out.println(n);
                continue;
            }
            double day1 = Math.ceil((double)(risk)/d);
            double day2 = Math.ceil((double)(norisk)/d);
            
            System.out.println((int)(day1 + day2));
        }
    }
}
