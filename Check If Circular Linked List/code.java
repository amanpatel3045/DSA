class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	

	if(head==null){
	    return true;
	}
		Node curr=head;
		while(curr.next!=head){
		    curr=curr.next;
		    if(curr==null){
		        break;
		    }
		}
		if(curr==null){
		    return false;
		}else{
		    return true;
		}
    }
}
