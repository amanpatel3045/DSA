public static void masaiPalindromicSubstring(String str){
    //write your code here
    int maxLen=0;
    for(int i=0;i<str.length();i++){
        for(int j=i;j<str.length();j++){
            String curr="";
            for(int k=i;k<=j;k++){
                curr=curr+str.charAt(k);
            }
            StringBuilder sb = new StringBuilder(curr);
            sb.reverse();
            String rev=sb.toString();
            if(rev.equals(curr)){
                if(maxLen<rev.length()){
                    maxLen = rev.length();
                }
            }
        }
    }
    System.out.println(maxLen);
  }
