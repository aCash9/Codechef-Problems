package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class facebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int maxLikes = Integer.MIN_VALUE;
            int index = 0, c = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] > maxLikes) {
                    maxLikes = a[i];
                    a[i]=-1;
                    index = i;
                }
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int rep = index;
            for (int i = 0; i < n; i++) {
                if (a[i] == maxLikes) {
                    if(b[i] > b[rep]){
                        c++;
                        rep = i;
                    }
                }
            }
            if (c == 0)
                System.out.println(++index);
            else {
                if (b[index] > b[rep])
                    System.out.println(++index);
                else
                    System.out.println(++rep);
            }
            t--;
        }
    }
}
