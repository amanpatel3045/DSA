class Solution{
  public static Node reverseLinkedList(Node x){
    //write your code here.
      
   Node prev=null;
   Node curr=x;
   Node forward=null;
   while(curr!=null){
       forward=curr.next;
       curr.next=prev;
       prev=curr;
       curr=forward;
  }
  return prev;
  }
}
