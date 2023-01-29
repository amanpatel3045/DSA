import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int tc = sc.nextInt();
        for(int z=0;z<tc;z++){
            String a =sc.next();
            HashMap<Character,Integer> p =new HashMap<>();
            StringBuilder s=new StringBuilder();
            Queue<Character> q = new LinkedList<>();
            for(int i=0;i<a.length();i++){
                char c=a.charAt(i);
                if(p.containsKey(c)){
                    p.put(c,p.get(c)+1);
                    while(!q.isEmpty() && p.get(q.peek())>1){
                       q.poll(); 
                    }
                }
                else{
                    p.put(c,1);
                    q.add(c);
                }
                if(!q.isEmpty()){
                    s.append(q.peek());
                }else{
                    s.append("#");
                }
            }
            System.out.println(s.toString());
        }
    }
}
