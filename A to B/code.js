function aToB(A,B){
    var count=0;
    
    while(A<B){
        if(A+2<=B){
            A+=2;
            count++;
        }
        else{
            A+=1;
            count++;
        }
    }
     console.log(count);
  }
