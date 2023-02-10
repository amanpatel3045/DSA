const LinkedListNode = class {
    constructor(nodeData) {
        this.data = nodeData;
        this.next = null;
    }
};

var deleteMiddle = function(head, n) {
    
 
    let length = 0
    let coun = head
    while(coun){
        coun = coun.next
       length++
    }

        
     length = Math.floor(length/2)
  
    if(length === 0){
        head = null
        return head
    }
    
    
    let secondhand = head
    let prev = head
    while(length > 1){
        secondhand = secondhand.next
        length--
    }
    secondhand.next = secondhand.next.next ? secondhand.next.next : null
    
    
    return head
};

