public static void stronglyTypedPassword(int n, String[] arr){
    //write your code here
   // @,$,#,*
   
   for(int i=0;i<n;i++){
       Boolean b=false;
       for(int j=0;j<arr[i].length();j++){
       if( arr[i].charAt(j)=='@' || arr[i].charAt(j)=='$' || arr[i].charAt(j)=='#' || arr[i].charAt(j)=='*' ){
         b=true;
       }
       }
       if(b){
           System.out.print("strong" +" ");
       }else{
           System.out.print("weak" +" ");
       }
   }
  }
