package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class LONGSEQQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String d = sc.next();
            int c1 = 0, c0 = 0,l=d.length();
            for (int i = 0; i < l; i++) {
                char ch = d.charAt(i);
                if(ch == '1')
                    c1++;
                else 
                    c0++;
            }
            if(c1 == l-1 || c0 == l-1)
                System.out.println("Yes");
            else 
                System.out.println("No");
            t--;
        }
    }
}
