package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;
import java.lang.*;
import java.io.*;

public class INSTAGRAM {
    /* package codechef; // don't place package name! */

    public static String commonChars(String str1, String str2) {
		StringBuilder commonChars = new StringBuilder();
 
		if (str1.length() > 0 & str2.length() > 0) {
			// We should iterate the smallest string in length.
			String toBeIterated = (str1.length() > str2.length() ? str2 : str1);
			// Once string to be iterated is finalized, get string to be checked
			String toBeChecked = toBeIterated.equals(str1) ? str2 : str1;
 
			// Iterating a string char by char
			for (int i = 0; i < toBeIterated.length(); i++) {
				// Check for common char
				if (toBeChecked.contains(Character.toString(toBeIterated.charAt(i)))) {
					// If contains append it to resultant string
					commonChars.append(Character.toString(toBeIterated.charAt(i)));
				}
			}
			return commonChars.toString();
		} else
			return "";
	}
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int maxsub = 0 ;
            for (int i = 1; i < n; i++) {
                String sub1 = str.substring(0,i);
                String sub2 = str.substring(i);
                String sub3 = commonChars(sub1, sub2);
                maxsub = Math.max(maxsub, sub3.length());
            }
            System.out.println(maxsub);
            t--;
        }
        // your code goes here
    }
}
