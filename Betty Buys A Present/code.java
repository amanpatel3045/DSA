import java.util.*;
public class Main{
    static int a,k;
    static List<List<Integer>> ans = new ArrayList();
    public static void check(int sum , ArrayList<Integer> lst,int n , int ind){
        if(sum==a&&n==k+1){
            List<Integer> t = new ArrayList<>();
            for(int i : lst){
                t.add(i);
            }
            ans.add(t);
            return;
        }
        if(n>k){
            return;
        }
        for(int i=ind;i<=9;i++){
            lst.add(i);
            check(sum+i,lst,n+1,i+1);
            lst.remove(new Integer(i));
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
         a = s.nextInt();
         k = s.nextInt();
        check(0,new ArrayList<Integer>(),1,1);
        for(List<Integer> lst : ans){
            for(int i:lst){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        if(ans.size()==0){
            System.out.print(-1);
        }
    }
}
