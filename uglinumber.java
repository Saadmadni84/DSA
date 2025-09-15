import java.util.Scanner;
public class uglinumber {
    public static int primeFactors(int num){
      int i=2;
      while(i*i<=num){
        while(num%i==0){ 
            if(i!=2 && i!=3 && i!=5)
            {
                return i;
            }
            num=num/i;
        }
        i++;
        
      } 
      if(num>1 && num!=2 && num!=3 && num!=5){
        return num;
    }
    return 0;
    }
    public static int ugli(int n){
      int i=1;
      int j=0;
      int k= primeFactors(n);
     
      if(k!=0){
        n=n+1;
      }
      while(i<=n){
        j++;
       if(j==1 || j%2==0 || j%3==0 || j%5==0 ){
         i++;
        }   
      }
      return j;
    }
    public static void main(String [] args ){
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(ugli(n));
    }   
}
