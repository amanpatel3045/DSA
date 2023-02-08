import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(isPrime(i))sum+=i;
        }
        System.out.println(sum);
    }
    private static boolean isPrime(int n){
        if(n==1 || n==0) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
