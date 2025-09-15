import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hashset {
    public static int lonelyinteger(int [] ls) {
        Set<Integer> s=new HashSet<>();
        for(Integer x:ls){
            if(s.contains(x)){
                s.remove(x);
            }
            else{
                s.add(x);
            }
        }
        for(int i:s){
            return i;
        
        }
        return -1;

       
    }
    public static void main(String[] args) {
       
      Scanner sc=new Scanner(System.in);
        System.out.println("number of element");
        int n=sc.nextInt();
        int [] ls=new int[n];
        for(int i=0;i<n;i++){
            ls[i] = sc.nextInt();
            
        }
        System.out.println(lonelyinteger(ls));

  
        
    }


    
}
