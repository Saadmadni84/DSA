public class plusone {
    public static int [] plone(int [] a){
        long x=0;
        int count=0;
        for(int i=0;i<a.length;i++){
             x=x*10+a[i];
        }
        x=x+1;
        System.out.println(x);
        long n=x;
        while(x>0){
            x=x/10;
            count++;
        }
        System.out.println(count);
        int []res=new int[count];
        for(int i=count-1;i>=0;i--){
            res[i]=(int)n%10;
            n=n/10;
        }
      return res;  
        
        
    }
    public static void main(String [] args){
        int [] a={1,2,3};
        System.out.println(plone(a));

}
    
}
