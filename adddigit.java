import java.util.Scanner;
public class adddigit {
    static int addDigits(int num){
       int n=num;
       int sum=0;
       int count=0;
       while(n>0){
           sum=sum+n%10;
           n=n/10;
           count++;
       }
       if(count>1){
           return addDigits(sum);
       }
       else{
           return sum;
       }
      

        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        System.out.println(addDigits(num));
    }
    
}
