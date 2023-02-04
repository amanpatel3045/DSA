class Solution{
  public static boolean detectPalindrome(Node a){
    Stack<Integer> check = new Stack<>();
    Node cur = a;
    while(cur!=null){
        check.push(cur.data);
        cur = cur.next;
    }
    while(a!=null){
        int x = check.pop();
        if(a.data!=x){
            return false;
        }
        a = a.next;
    }
    return true;
  }
}

