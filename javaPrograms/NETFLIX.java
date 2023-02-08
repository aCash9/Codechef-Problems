package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class NETFLIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();

            if (a + b >= x || a + c >= x || c + b >= x)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
