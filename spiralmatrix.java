import java.util.List;
import java.util.ArrayList;
public class spiralmatrix {
    public static List<Integer> spiral(int [][]a){
      List<Integer> ls=new ArrayList<>();
      int t=0;
      int b=a.length-1;
      int l=0;
      int r=a[0].length-1;
     
      while(t<=b && l<=r){
        for(int i=l;i<=r;i++){
            ls.add(a[t][i]);
        }
        t++;
        for(int i=t;i<=b;i++){
            ls.add(a[i][r]);
        }
        r--;
        if(!(t<=b && l<=r)){
            break;
        }
        for(int i=r;i>=l;i--){
            ls.add(a[b][i]);
        }
        b--;
        for(int i=b;i>=t;i--){
            ls.add(a[i][l]);
        }
        l++;       
      }
      return ls;
    }
    public static void main(String [] args){
    int [][] a={{1,2,3,4,0},      
                {5,6,7,8,0},
                {9,10,11,12,0},
                };
        System.out.println(spiral(a));

   }
    
}
