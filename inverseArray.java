public class inverseArray {
    public static void inversearr(int [] a){
        int [] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[a[i]]=i;
        }
        for(int j=0;j<b.length;j++){
        System.out.print(b[j]+" ");
        }
    }
    public static void main(String[] args){
    int [] arr={2,3,1,0,4};
    inversearr(arr);
    } 
}
