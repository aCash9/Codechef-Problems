package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class QTOO_2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            int min = Integer.MAX_VALUE;
            for (Map.Entry<Character, Integer> ele : map.entrySet()) {
                int freq = ele.getValue();
                if (freq == 1)
                    continue;
                min = Math.min(min, freq);
            }
            if (min == Integer.MAX_VALUE)
                System.out.println(-1);
            else
                System.out.println(n - min);
        }
    }
}
