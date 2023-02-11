import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc-->0){
            int n = s.nextInt();
            String se = s.next();
            String g = s.next();
            int b = 0,c=0;
          int num[] = new int[10];
    for (int i = 0; i<n; i++) {
        int s1 = Character.getNumericValue(se.charAt(i));
        int g1 = Character.getNumericValue(g.charAt(i));
        if (s1 == g1)
        b++;
        else {
            if (num[s1] < 0)
            c++;
            if (num[g1] > 0)
            c++;
            num[s1] ++;
            num[g1] --;
        }
       }
       System.out.println(b + "A" + c + "B");
        }
    }
}
