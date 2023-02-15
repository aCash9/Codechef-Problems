package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class CHRGES {
    static int NO_OF_CHARS = 256;

    static boolean canFormPalindrome(String str) {

        // Create a count array and initialize all
        // values as 0
        int count[] = new int[NO_OF_CHARS];
        Arrays.fill(count, 0);

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (int i = 0; i < str.length(); i++)
            count[(int) (str.charAt(i))]++;

        // Count odd occurring characters
        int odd = 0;
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if ((count[i] & 1) == 1)
                odd++;

            if (odd > 1)
                return false;
        }

        // Return true if odd count is 0 or 1,
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l1 = sc.nextInt();
            int l2 = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();

            String large = l1 > l2 ? s1 : s2;
            String small = large.compareTo(s1) == 0 ?s2 : s1;
            
            String left = "";
            int counter = 0;

            char[] cha = large.toCharArray();

            for (int i = 0; i < small.length(); i++) {
                char ch = small.charAt(i);
                for (int j = 0; j < large.length(); j++) {
                    if (ch == cha[j]) {
                        counter++;
                        cha[j]='*';
                    }
                }
            }
            for (int i = 0; i < large.length(); i++) {
                if(cha[i] != '*')
                    left += cha[i];
            }
            if (counter == small.length() && canFormPalindrome(left))
                System.out.println("Yes");

            else
                System.out.println("No");
        }
    }
}
