package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class READPAGES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(!(n > (x*y)))
                System.out.println("Yes");
            else 
                System.out.println("No");
        }
    }
}
