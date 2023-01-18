import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int f=fact(n);
       System.out.println(f);
    }
    static int fact(int n){
            if(n==0){
                return 0;
            }else if(n==1){
                return 1;
            }
            else{
               return n*fact(n-1);
            }
        }
}
