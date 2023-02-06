//Enter code here
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int array[] = new int[n];
            for(int i=0;i<n;i++){
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            // System.out.println(Arrays.toString(arr));
            for(int i=0;i<n;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
}
