public class transposematrix {
    public static void tranpo(int [][]a){
        int l=a.length;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
              int temp=a[i][j];
              a[i][j]=a[j][i];
              a[j][i]=temp;
            }
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
    }
}
    public static void main(String[]args){
         int [][] a={{1,2,3},
        {4,5,6},{
            7,8,9
        }};
        tranpo(a);

    } 
}
