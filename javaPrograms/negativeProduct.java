package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class negativeProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a * b < 0 || a * c < 0 || b * c < 0)
                System.out.println("Yes");
            else
                System.out.println("No");
            t--;
        }
    }
}
