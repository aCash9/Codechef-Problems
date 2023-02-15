package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class AIRLINES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            x *= 10;
            if (y >= x)
                System.out.println(x*z);
            else if(y < x)
                System.out.println(y*z);
        }
    }
}
