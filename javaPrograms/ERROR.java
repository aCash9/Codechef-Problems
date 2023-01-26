package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class ERROR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int c = 0;
            String fd = sc.next();
            for (int i = 0; i < fd.length() - 2; i++) {
                if ((fd.charAt(i) != fd.charAt(i+1)) && (fd.charAt(i+1) != fd.charAt(i+2))) {
                    c++;
                }
            }
            if (c > 0)
                System.out.println("Good");
            else
                System.out.println("Bad");
        }
    }
}
