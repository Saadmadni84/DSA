public class bitonicsearch {
    public static int ascendingbs(int key,int [] a,int range){
        int l=0,h=range-1,m=0;
        while(l<=h){
            m=(l+h)/2;
            if(key==a[m]){
                return m;
            }
            else if(key>a[m]){
                l=m+1;

            } 
            else{
                h=m-1;
              
            }
        }
        return -1;
    }
    public static int decendingbs(int key,int [] a,int range){
        int l=range+1,h=a.length-1,m=0;
        while(l<=h){
            m=(l+h)/2;
            if(key==a[m]){
                return m;
            }
            else if(key>a[m]){
                 h=m-1;

            } 
            else{
               
                l=m+1;
              
            }
        }
        return -1;

    }
    public static int searchbitonic(int [] a){
        int l=0,r=a.length-1,m=0;
        while(l<=r){
            m=(l+r)/2;
            if(a[m]>a[m-1] & a[m]>a[m+1]){
                return m;
            }
            else if(a[m]>a[m-1] & a[m]<a[m+1]){
                l=m;
            }
            else {
                r=m;
            }
        }
        return -1;

    }
    public static int findbitonic( int b,int  [] a,int bIndex){
        if(b==a[bIndex]){
            return bIndex;
        }
        if(b>a[bIndex]){
            return -1;

        }
        int res1=ascendingbs(b,a,bIndex);
        if(res1!=-1){
            return res1;
        }
        int res2=decendingbs(b,a,bIndex);
        if(res2!=-1){
            return res2;
        }
        return -1;
    }
    public static void main(String [] args){
        int [] a={5,6,7,8,9,10,4,3,2,1};
        int b=8;
        int bIndex=(searchbitonic(a));
        System.out.println(findbitonic(b,a,bIndex));
    }
    
}
