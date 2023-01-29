import java.util.*;
  class Main{
      public static void main(String []args){
          Scanner sc=new Scanner(System.in);
              Queue<Integer> master = new LinkedList<>();//master queue
     Queue<Integer> q1 = new LinkedList<>(); //queue for club 1
     Queue<Integer> q2 = new LinkedList<>(); //queue for club 2
    Queue<Integer> q3 = new LinkedList<>();//queue for club 3
    Queue<Integer> q4 = new LinkedList<>(); //queue for club 4
    int n = sc.nextInt(); // number of queries
    for (int i=0;i<n;i++){
       char x = sc.next().charAt(0); //query type
        if (x == 'E'){
          int club = sc.nextInt(); //type of club
           int roll = sc.nextInt();//roll number of student
            if (club == 1){ 
                if (master.isEmpty() || !master.contains(club)) master.add(club);
                q1.add(roll);
            }else if (club == 2){
                if (master.isEmpty() || !master.contains(club)) master.add(club);
                q2.add(roll);
            }else if (club == 3){
                if (master.isEmpty() || !master.contains(club)) master.add(club);
                q3.add(roll);
            }else if (club == 4){
                if (master.isEmpty() || !master.contains(club)) master.add(club);
                q4.add(roll);
            }
        }else{
            if (master.peek() == 1){
                System.out.println(1 + " " + q1.peek());
                q1.remove();
                if (q1.isEmpty()) master.remove(1);
            }else if (master.peek() == 2){
                System.out.println(2 + " " + q2.peek());
                q2.remove();
                if (q2.isEmpty()) master.remove(2);
            }else if (master.peek() == 3){
                System.out.println(3 + " " + q3.peek());
                q3.remove();
                if (q3.isEmpty()) master.remove(3);
            }else if (master.peek() == 4){
                System.out.println(4 + " " + q4.peek());
                q4.remove();
                if (q4.isEmpty()) master.remove(4);
            }
        }
}
      }
  }
