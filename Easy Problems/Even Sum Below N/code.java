public static void evenSumBelowN(int num){
    //write your code here
    int bag=0;
    for(int i=1;i<=num;i++)
    {
        //int bag=1;
        if(i%2==0)
        {
            
            //System.out.println(i);
            bag=bag+i;
            //System.out.println(bag);
        }//System.out.println(bag);
        else
        {
            continue;
        }
    }System.out.println(bag);
  }
