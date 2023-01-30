import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans = now(n);
        System.out.println(ans);
    }
    static int now(int n){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }else{
            return now(n-1)+now(n-2)+now(n-3);
            
        }
    }
}
