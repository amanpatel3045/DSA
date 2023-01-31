import java.util.*;
class Main{
public static ArrayList<Integer> gifts = new ArrayList<Integer>();
    
public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int shop[]=new int[n];
        for(int x=0;x<n;x++)
        shop[x]=x+1;
        
         pikItems(shop, 0, k);
    }


       
   public static void pikItems(int shop[], int index, int k){
        if (k == 0){
            for(int z = 0; z < gifts.size(); z++){
                System.out.print(gifts.get(z) + " ");
            }
            System.out.println();
            return;
        }
  
        for (int i=index; i<shop.length; i++){
            gifts.add(shop[i]);
            pikItems(shop, i+1, k-1);
            gifts.remove(gifts.size()-1);
        }
    }
  
}
