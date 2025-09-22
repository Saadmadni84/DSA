public class reversingmatrix {
    public static void reverse(int [][]a){
       
        for(int i=0;i<a.length;i++){
            int k=1;
            for(int j=0;j<a[i].length/2;j++){
              int temp=a[i][j];
               a[i][j]=a[i][a[i].length-k];
               a[i][a[i].length-k]=temp;  
               k++;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
        
    }
    public static void main(String [] args){
    int [][] a={{1,2,3,4,0},      
                {5,6,7,8,0},
                {9,10,11,12,0},
                };
     reverse(a);   
}
}
