package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class TWODIFFPALIN {
    public static boolean two(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a % 2 != 0 && b % 2 != 0) || (a == 1 || b == 1)) {
                System.out.println("No");
                continue;
            }
            System.out.println("Yes");
        }

    }
}
