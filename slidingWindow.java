public class slidingWindow {
    public static int smax(int [] a,int k){
        int max=0;
        int temp=0;
        for(int i=0;i<k;i++){
             max=max+a[i];
             temp=max;     
        }
        for(int i=k;i<a.length;i++){
            max=max+a[i]-a[i-k];// Add new, remove old
        if (windowSum > maxSum) {
            if(max>temp){
                temp=max;
            }
        }
    }
        return temp;

    }
    public static void main(String[] args) {
        int [] a={1,-2,-2,-1,5};
        int k=3;
        System.out.println(smax(a,k));

    }

}
    
