public class CountNoOfdg {
    public static int count(int n){
        int count = 0;
        while(n!=0){
           n=n/10;
           count++; 
        }
        return count;
    }

    
    
    public static void main(String[] args) {
        int n=123456;
        System.out.println(count(n));

        
    }
    
}
