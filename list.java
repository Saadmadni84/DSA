import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list {
    public static int lonelyinteger(List<Integer> a) {
        int ans=0;
        for(Integer x:a){
            ans=ans^x;
        }
        return ans;

    }
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("number of element");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ls.add(sc.nextInt());
        }
        System.out.println(lonelyinteger(ls));

    }
    
}
