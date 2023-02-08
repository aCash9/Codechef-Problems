package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class BTRYHLTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n >= 80)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
