import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int vcxz = sc.nextInt();
        int count = 0;
        for(int z=0; z<n; z++){
            arr[z]=sc.nextInt();
            if(arr[z]==vcxz){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
