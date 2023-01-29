import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        //int Q=sc.nextInt();
       // int x = newInt();
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        int tc=sc.nextInt();
        for(int i=0;i<tc;i++){
            int Q=sc.nextInt();
            if(Q==1){
                q.add(sc.nextInt());
            }
            else if(Q==2){
                st.push(sc.nextInt());
            }
            else if(Q==3){
                if(!q.isEmpty()){
                    int ans1=q.peek();
                System.out.println(ans1);
                }else{
                    System.out.println("-1");
                }
            }
            else if(Q==4){
                if(st.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(st.peek());
                }
            }
            else if(Q==5) {
                int QTOP=q.poll();
                st.push(QTOP);
            }
            
        //--;
            
        }
        
    }
}
