package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class bibi {
    public static int helper(int[] b, int index) {
        while (index > 0) {
            for (int i = 0; i < b.length; i++) {
                if (b[i] >= (-1 * index) && b[i] <= index) {
                    return -1;
                } else
                    return index;
            }
            index--;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            int c = 0;
            int posMin = Integer.MAX_VALUE, negMax = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] > 0 && b[i] < posMin)
                    posMin = b[i];
                else if (b[i] < 0 && b[i] > negMax)
                    negMax = b[i];
                else if (b[i] == 0) {
                    c++;
                }
            }
            if (c > 0) {
                System.out.println(-1);
                t--;
                continue;
            }
            if (posMin == Integer.MAX_VALUE && negMax == Integer.MAX_VALUE)
                System.out.println(-1);

            if (posMin != Integer.MAX_VALUE) {
                posMin = helper(b, --posMin);
            }
            if (negMax != Integer.MIN_VALUE) {
                negMax *= -1;
                negMax = helper(b, --negMax);
            }
            if (posMin != Integer.MAX_VALUE && negMax != Integer.MIN_VALUE) {
                if(posMin != -1 && negMax != -1)
                    System.out.println((posMin > negMax) ? negMax : posMin);
                else if(posMin == -1)
                    System.out.println(negMax);
                else if(negMax == -1)
                    System.out.println(posMin);
            } else if (negMax != Integer.MIN_VALUE)
                System.out.println(negMax);
            else
                System.out.println(posMin);
            t--;
        }
    }
}
