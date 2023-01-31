import java.util.*;
class Main{
    public static void merge(int[]a, int [] b, int result[] , int k, int l){
        int i = 0;
        int j = 0;
        int m = 0;
        while(i<k){
            result[m] =a[i];
            i++;
            m++;
        }
        while(j<l){
            result[m]=b[j];
            j++;
            m++;
        }
        Arrays.sort(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
    for(int x=0; x<n; x++){
        a[x] = sc.nextInt();
    }
    for(int o=0; o<n; o++){
        b[o] = sc.nextInt();
    }
    int k = a.length;
    int l = b.length;
    int result[] = new int [k+l];
    merge(a,b,result,k,l);
    for(int p=0; p<result.length; p++){
        System.out.print(result[p]+" ");
    }
    }
}
