import java.util.*;
class Main{
    static String dance(int[] boys, int[] girls){
        int i=0,j=0;
        while(i < boys.length && j < girls.length){
            if(boys[i] <= girls[j]){
                return "NO";
            }
            i++;
            j++;
        }
        return "YES";
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int[] boys = new int[M];
            int[] girls = new int[N];
            for(int aman=0; aman<M; aman++){
                boys[aman] = sc.nextInt();
            }for(int bprak=0; bprak<N; bprak++){
                girls[bprak] = sc.nextInt();
            }
            Arrays.sort(boys);
            Arrays.sort(girls);
            System.out.println(dance(boys,girls));
        }
    }
}
