class Solution {

	public boolean reverseCompare(ListNode head1, ListNode head2) {
	ListNode n1 = head1;
		ListNode n2 = head2;
		Stack<Integer> s1 = new Stack<>();
		while(n1!=null){
		    s1.push(n1.val);
		    n1=n1.next;
		}
		n1=head1;
		while(n1!=null){
		    n1.val=s1.pop();
		    n1=n1.next;
		}
		Stack<Integer> s2 = new Stack<>();
		while(n2!=null){
		    s2.push(n2.val);
		    n2=n2.next;
		}
		n2=head2;
		while(n2!=null){
		    n2.val=s2.pop();
		    n2=n2.next;
		}
		
		while(head1!=null&&head2!=null){
		    if(head1.val==head2.val){
		        head1=head1.next;
		        head2=head2.next;
		    }
		    else if(head1.val>head2.val){
		        return false;
		    }
		    else
		       return true;
		}
		return true;
	}
}
