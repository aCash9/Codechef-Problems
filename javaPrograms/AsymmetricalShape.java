package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class AsymmetricalShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            PriorityQueue<Integer> q1 = new PriorityQueue<>();
            PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > max)
                    max = a[i];
                q1.add(a[i]);
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] < min)
                    min = a[i];
                q2.add(b[i]);
            }
            int aMax = Integer.MIN_VALUE, aMin = Integer.MAX_VALUE;
            
            t--;
        }
    }
}
