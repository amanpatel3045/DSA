function checkprime(num){
  let count = 0;
    for(let i=1; i<=num; i++){
        if(num % i == 0){
            count++;
        }
    }
    if(count==2){
        return true;
    }else{
        return false;
    }
}

function sumOfSpecialPairs(N,A){
    //write code here
     var bag=0;
for(var i=0;i<N;i++){
   
    for(var j=i+1;j<N;j++){            
        if(i<j && checkprime(j-i) ){
           bag=bag + Math.abs(A[j]-A[i]);
        } 
    }
   
}
console.log(bag);
}
