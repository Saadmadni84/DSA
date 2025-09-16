public class matrixmedianop {
    public static int medianop(int [][] a){
        int min=a[0][0];
        int max=a[0][0];
        int medianpos=(a.length*a[0].length+1)/2;
        for(int i=0;i<a.length;i++){
            if(min>a[i][0]){
                min=a[i][0];
            }
            if(max<a[i][a[0].length-1]){
            max=a[i][a[0].length-1];
          }
        }
        while(min<max){
            int mid=(min+max)/2;
            int count=0;
            for(int i=0;i<a.length;i++){
              int x=findcount(a[i],mid);
              count=count+x;
            }
            if(count<medianpos){
               min=mid+1;
            }
            else{
                max=mid;
            }
        }
        return min;
    }
        static int findcount(int [] ar,int mid){
           int count=0;
           for(int i=0;i<ar.length;i++){
            if(ar[i]<=mid){
              count++;
            }
            else {
                break;
            }
           }
           return count;
        }
    
    public static void main(String [] args){
        int [][] a={{1,2,3,4},
        {4,5,6,8},{
            7,8,9,99
        }};
        System.out.println(medianop(a));

    }
    
}
