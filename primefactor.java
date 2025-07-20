import java.util.Scanner;
public class primefactor {
    public static void primeFactors(int num){
      int i=2;
      while(i*i<=num){
        while(num%i==0){
            System.out.println(i);
            num=num/i;
        }
        i++;
        
      } 
      if(num>1){
        System.out.println(num);
      
    }
}
    



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        primeFactors(num);
    }
    
}
