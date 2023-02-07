import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc= sc.nextInt();
    for(int a=0; a<tc; a++){
      int n = sc.nextInt();
      String[] str =new String[n];
      for(int i=0;i<n;i++){
        str[i]=sc.next();
      }
      int z = n;
      boolean hori = true;
      for(int i=0;i<z;i++){
        if(str[i].equals(str[z-1])){
          hori = true;
        }else{
          hori = false;
          break;
        }
        z--;
         
       }
      
     boolean vert = true;
    for(int i=0;i<n;i++){
      int y = n;
      for(int j=0;j<y;j++){
        if(str[i].charAt(j)!=str[i].charAt(y-1)){
          vert=false;
          break;  
        }
        
        y--;
      }
    }
      if(hori && vert){
         System.out.println("BOTH");
       }else if(hori){
        System.out.println("HORIZONTAL");
      }else if(vert){
        System.out.println("VERTICAL");
      }else{
        System.out.println("NO");
      }
     
    }
    
  }
}
