public static void minimumNumberOfGroups(int N, int A[]){
    //write your code here
    int group=1;int last=A[0];
    for(int i=1;i<N;i++){
        if(A[i]>=last){
            last=A[i];
        }
        else{
            group=group+1;
            last=A[i];
        }
    }
    System.out.println(group);
  }
