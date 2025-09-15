import java.util.Scanner;

public class RePalindrome {
    public static boolean isPalindrome(String s,int f,int l){
        if(f>=l){
            return true;
        }
        if(s.charAt(f)!=s.charAt(l)){
            return false;
        }
        return isPalindrome(s,f+1,l-1);
        
        }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        String s = scan.nextLine();
        int f,l;
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
    
}
