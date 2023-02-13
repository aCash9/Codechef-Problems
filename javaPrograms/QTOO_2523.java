package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class QTOO_2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            if(n <= 2)
                System.out.println(-1);
            ArrayList<Character> l = new ArrayList<>();
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if(l.contains(str.charAt(i)))
                    flag = 1;
                else 
                    l.add(str.charAt(i));
            }
            if(flag == 1)
                System.out.println(n-2);
                else 
                System.out.println(-1);
        }
    }
}
