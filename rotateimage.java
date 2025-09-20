

public class rotateimage {
    public static void rotate(int [][] a){
        int l=a.length;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
              int temp=a[i][j];
              a[i][j]=a[j][i];
              a[j][i]=temp;
            }
        }
        
        for(int i=0;i<l;i++){
            int p=1;
            for(int j=0;j<l/2;j++){
                int temp =a[i][j];
                a[i][j]=a[i][l-p];
                a[i][l-p]=temp;
                p++;
            }
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
    }
    }
   public static void main(String[] args) {
       
         int [][] a={{1,2,3},
                     {2,3,2},
                     {5,6,7},};
        
        rotate(a);
    }
}
