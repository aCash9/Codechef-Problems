package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class TEKKEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a > b && a > c)
                System.out.println("Yes");
            else if( a > Math.abs(b-c))
                System.out.println("Yes");
            else 
                System.out.println("No");    
        }
    }
}
