    var c1=0;
	var c2=0;
	var c3=0;
	var c4=0;
	for(i=0;i<N;i++)
	{
	    if(arr[i]%4==0)
	    {
	        c1++;
	    }
	    if(arr[i]%2==0)
	    {
	        c2++;
	    }
	    if(arr[i]%3==0)
	    {
	        c3++;
	    }
	    if(arr[i]%2!=0&&arr[i]%3!=0&&arr[i]%4!=0)
	    {
	        c4++;
	    }
	}
