package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class PROINC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int bp = x - y;
            int nsp = x + (int) (x * 0.1);

            System.out.println(nsp - bp);
        }
    }
}
