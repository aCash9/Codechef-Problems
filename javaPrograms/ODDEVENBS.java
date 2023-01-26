package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class ODDEVENBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            int sum = 0, even = 0, odd = 0;
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] == 0)
                    even++;
                else
                    odd++;
            }
            sum += odd;
            n = n - sum;
            if ((n >= 2 && n%2==0) || even ==0 )
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}
//  0 0  1 1 1 1 0