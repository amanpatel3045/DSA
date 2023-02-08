import java.util.*;
class Main{
public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int tc=sc.nextInt();
   while(tc-->0){
    int n=sc.nextInt();
     String s=sc.next();
     char k=sc.next().charAt(0);
     int count=0;
     for(int i=0;i<n;i++){
     if(s.charAt(i)==k){
     count+=i+1;  
     }
      }
      System.out.println(count);
     }
     }
   }
