class Solution{
  Stack<Integer> Stack1 = new Stack<>();
  Stack<Integer> Stack2 = new Stack<>();
  
  public void add(int data){
  
  Stack1.push(data);
  }
  
  public int remove(){
while(!Stack1.empty()){
    Stack2.push(Stack1.pop());
}
int ans=Stack2.pop();
while(!Stack2.empty()){
    Stack1.push(Stack2.pop());
}
return ans;
  }
  
  public int front(){
     while(!Stack1.empty()){
    Stack2.push(Stack1.pop());
}
int ans=Stack2.peek();
while(!Stack2.empty()){
    Stack1.push(Stack2.pop());
}
return ans;
  }

}
