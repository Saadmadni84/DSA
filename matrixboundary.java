public class matrixboundary {
    public static void clock(int [][] a ){
     int i=0,j=0;
     for(j=0;j<a[i].length;j++){
       System.out.println(a[i][j]);
     }
     j=a[i].length-1;
     for(i=1;i<a.length;i++){
         System.out.println(a[i][j]);
     }
     i=a.length-1;
     for(j=a[i].length-2;j>=0;j--){
        System.out.println(a[i][j]);
     }
     j=0;
     for(i=a.length-2;i>=1;i--){
        System.out.println(a[i][j]);
     }

    }
    public static void main(String [] args){
         int [][] a={{1,2,3,4},{
            2,3,2,3
         },
        {5,6,7,8},{
            7,8,9,99
        }};
        clock(a);
    }

    
}
