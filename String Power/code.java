import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int tc = sc .nextInt();
        while(tc-->0){
            String str = sc.next();
            int n = str.length();
            // int pow = 0;
            int len = 1;
            int i = 0;
            int j = 0;
            while(j<n){
                if(str.charAt(i)==(str.charAt(j))){
                    j++;
                    // pow = j-i;
                    // if((pow + 1) >= len){
                    //     len = pow;
                    //     }
                    len = Math.max(len,(j-i));
                }else{
                    i = j;
                }
            }
            // len = Math.max(len,(j-i));
            
            System.out.println(len);
        }
    }
}
