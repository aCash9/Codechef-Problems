package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class BRACKETS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            int balance = 0, max_balance = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '(')
                    balance += 1;
                else
                    balance -= 1;

                max_balance = Math.max(balance, max_balance);
            }
            char[] s1 = new char[max_balance];
            char[] s2 = new char[max_balance];
            Arrays.fill(s1, '(');
            Arrays.fill(s2, ')');

            System.out.println(String.copyValueOf(s1)+String.copyValueOf(s2));
        }
    }
}
