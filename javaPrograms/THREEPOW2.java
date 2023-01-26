package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class THREEPOW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int num = 0, pow = n - 1;
            int[] two = new int[n];
            Arrays.fill(two, -1);
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '1')
                    two[index++] = pow;

                pow--;
            }
            for (int i : two)
                System.out.println(i);
        }
    }
}
