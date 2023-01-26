package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class farFromOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            double dist1 = Math.sqrt(x1*x1 + y1*y1);
            double dist2 = Math.sqrt(x2*x2 + y2*y2);

            if(dist1 == dist2)
                System.out.println("EQUAL");
            else if( dist1 > dist2)
                System.out.println("ALEX");
            else
                System.out.println("BOB");
            
            t--;
        }
    }
}
