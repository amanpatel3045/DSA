import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int x11 = sc.nextInt();
            int x22 = sc.nextInt();
            int x33 = sc.nextInt();
            
            if((x11+x22)>x33 && (x22+x33)>x11 && (x11+x33)>x22){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
