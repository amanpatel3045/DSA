import java.util.*;
class Main{
    
        public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc--!=0){
            int ans=0;
            int n=sc.nextInt();
            int m=sc.nextInt();
            for(int i=0;i<n;i++){
                String str=sc.next();
                if(str.charAt(m-1)=='R')
                ans++;
                if(i==n-1){
                    for(int j=0;j<m-1;j++){
                        if(str.charAt(j)=='D')
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
