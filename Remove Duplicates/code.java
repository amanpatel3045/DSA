class Solution{
  public Node removeDuplicates(Node a){
      
    Node cur = a;
    // if (!curr)
    // {
    //     return null;
    // }
    while (cur.next!=null)
    {
        if (cur.data==cur.next.data)
        {
            cur.next=cur.next.next;
        }
        else
        {
            cur=cur.next;
        }
    }
    return a;
  }
}
