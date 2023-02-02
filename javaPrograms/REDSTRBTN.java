package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class REDSTRBTN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if ((x + y + z) >= 6)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
