package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class BALLOON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] q = new int[n];
            for (int i = 0; i < n; i++) {
                q[i] = sc.nextInt();
            }
            for (int i = n - 1; i >= 0; i--) {
                if (q[i] >= 1 && q[i] <= 7) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
//brutforce approach
// public class BALLOON {
// public static boolean helper(int[] c){
// int counter = 0;
// for (int i = 0; i < 7; i++) {
// if(c[i]==-1)
// counter++;
// }
// if(counter > 0)
// return false;
// else
// return true;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while (t-- > 0) {
// int n = sc.nextInt();
// int[] c = new int[n];
// Arrays.fill(c,-1);
// int[] q = new int[n];
// for (int i = 0; i < n; i++) {
// q[i] = sc.nextInt();
// }
// for (int i = 0; i < n; i++) {
// c[q[i]-1] = q[i];
// if(helper(c)){
// System.out.println(i+1);
// break;
// }
// }
// }
// }
// }
