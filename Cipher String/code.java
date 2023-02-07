//Enter code here
import java.util.*;

class Main{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            String str = sc.next();
            int count = 1 ;
            String str1 = "";
for(int ij = 1 ; ij < n ; ij++){
    if(str.charAt(ij) == str.charAt(ij-1)){
        count++;
    }else{
        str1 = str1 + str.charAt(ij-1) + count;
        count = 1;
    }
}

str1 = str1 + str.charAt(n-1) + count;


System.out.println(str1);

        }
    }
}
