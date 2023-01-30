class Solution{
  Queue<Integer> queue1 = new LinkedList<>();
  Queue<Integer> queue2 = new LinkedList<>();
  
  public void push(int data){
    //write your code here.
    while(!queue1.isEmpty()){
        queue2.add(queue1.poll());
    }
    queue1.add(data);
    while(!queue2.isEmpty()){
        queue1.add(queue2.poll());
    }
    return;
  }
  
  public void pop(){
    //write your code here.
    queue1.poll();
    return;
  }
  
  public int top(){
    //write your code here.
    int ans = queue1.peek();
    return ans;
  }
}
