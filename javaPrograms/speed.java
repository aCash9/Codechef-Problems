package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int x = sc.nextInt();
            if (x <= 70)
                System.out.println(0);
            else if (x > 70 && x <= 100)
                System.out.println(500);
            if (x > 100)
                System.out.println(2000);
            t--;
        }
    }
}
