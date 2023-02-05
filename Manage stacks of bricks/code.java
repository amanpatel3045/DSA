import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int ini[] = new int[n];
            int fin[] = new int[n];
            
            for(int z=0; z<n; z++){
                ini[z] = sc.nextInt();
                fin[z] = sc.nextInt();
            }
            
            Arrays.sort(ini);
            Arrays.sort(fin);
            
            System.out.println(bricks(ini, fin, n, x, y));
        }
    }
    
    public static int bricks(int ini[], int fin[], int n, int x, int y){
        int efforts = 0;
        for(int i=0; i<n; i++){
            if(ini[i]<fin[i]){
                efforts = efforts + (fin[i]-ini[i])*x;
            }else if(ini[i]>fin[i]){
                efforts = efforts + (ini[i]-fin[i])*y;
            }
        }
        
        return efforts;
    }
    
    
    
}
