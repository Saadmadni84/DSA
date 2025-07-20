import java.util.Scanner;
class checkpalindrome {
    public boolean isPalindrome(int num) {
        int reversed = 0;
        int temp = num;
        if (num<0);
        {
            return false;
        }

        while (temp!= 0) {
            int remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp = temp / 10;
        }
        return reversed == num; 
        
    }

    public static void main(String[] args) {
        checkpalindrome s =new checkpalindrome();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();  
        System.out.println(s.isPalindrome(num));
    }
    
}

        
   