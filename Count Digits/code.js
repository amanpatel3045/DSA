function countZerosOnesTwos(N,arr){
    //write code here
    let c1=0,c2=0, c3=0;
    let ones=0;twos=0;zeros=0;
    let total;
    newarr=arr;
    for(let i=0;i<N;i++)
    {
        if(newarr[i]===0)
        {
            zeros++;
        }
        if(newarr[i]==1)
        {
            ones++;
        }
        if(newarr[i]==2)
        {
            twos++;
        }
    }
    console.log(zeros,ones,twos);
}
