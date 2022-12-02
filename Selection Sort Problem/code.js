function solve(N,arr){
    for(i=0;i<N-1;i++)
    {
        min=i;
        for(j=i+1;j<N;j++)
        {
            if(arr[min]>arr[j])
            {
                min=j;
            }
        }var container=arr[i];
        arr[i]=arr[min];
        arr[min]=container;
        //console.log(arr);
    }
console.log(arr.join(" "));
}
