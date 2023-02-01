import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            String str = sc.next();
            System.out.println(aman(str, n, 0));
            ans.clear();
        }
    }
    
    public static ArrayList<String> ans = new ArrayList<>();
    public static int aman(String str, int n, int i){
        if(i>str.length()){
            return ans.size();
        }
        for (int z = i + 1; z <= str.length(); z++) {
                String test = str.substring(i, z);
                if(!ans.contains(test))
                ans.add(test);
            }
            i = i + 1;
            return aman(str,n, i);
            
    }
    
}
