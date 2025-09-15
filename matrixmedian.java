import java.util.Arrays;
public class matrixmedian {
    public static int medianm(int [][] a){
      int c=a.length;
      int r=a[0].length;
      int k=0;
      int [] res= new int [c*r];
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            res[k]=a[i][j];
            k++;
        }
      }
      Arrays.sort(res);
      if(res.length%2==0){
        return (res[res.length/2]+res[(res.length/2)-1])/2;
      }
      else{
        return res[res.length/2];
      }

    
    }
   public static void main(String [] args){
    int [][] a={{1,2,3,4},
        {4,5,6,8},{
            7,8,9,99
        }};
        System.out.println(medianm(a));

   }
}
