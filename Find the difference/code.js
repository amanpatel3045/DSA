function findDifference(N, arr){
    for(var i=0;i<=N-1;i++)
    {
        for(j=i+1;j<=N-1;j++)
        {
            var diff= Math.abs(arr[i]-arr[j]);
            console.log("The difference between " +i+ " and " +j+ " is " +diff);
            
        }
    }

}

