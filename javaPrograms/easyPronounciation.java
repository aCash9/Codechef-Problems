package CompetitiveCodingCodeChief.javaPrograms;

import java.util.*;

public class easyPronounciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int l = sc.nextInt();
            String str = sc.next();
            int counter = 0;
            for (int i = 0; i < l; i++) {
                int ch = str.charAt(i);
                if(counter == 4)
                    System.out.println("No");
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
                    counter++;
            }
            if(counter < 4)
                System.out.println("Yes");
            t--;
        }
    }
}
