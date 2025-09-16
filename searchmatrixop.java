public class searchmatrixop {
    public static boolean srm(int [][] a,int t ){
     int l=0,h=(a.length*a[0].length-1);
     while(l<=h){
        int mid=(l+h)/2;
        int r=mid/a[0].length,c=mid%a[0].length;
        if(a[r][c]==t){
            return true;

        }
        else if(t<a[r][c]){
            h=mid-1;
        }
        else{
            l=mid+1;
        }
     }
     return false;
    }
    
    public static void main(String [] args){
         int [][] a={{1,3,5,7},
        {5,5,6,7},{
            8,8,9,99
        }};
        int t=3;
        System.out.println(srm(a,t));
   }   
}
