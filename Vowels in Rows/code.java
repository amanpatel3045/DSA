public static void vowelsInRows(int rows, int cols, char mat[][]){
    //write your code he
for(rows=0;rows<mat.length;rows++){
boolean b=false;
for(cols=0;cols<mat[0].length;cols++){
         
if(mat[rows][cols]=='a' || mat[rows][cols]=='e' || mat[rows][cols]=='i' || mat[rows][cols]=='o' || mat[rows][cols]=='u')
           {
                      b=true;
           }
          
           
               
       } 
       if(b){
       
            System.out.println("Yes");
           }else{
               System.out.println("No");
   } }
  }
 Overview
 Announcements
 Problems
 Submissions
 Rankings
