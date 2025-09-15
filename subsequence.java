import java.util.Scanner;

public class subsequence {
    public static void gss(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        
        gss(s.substring(1),ans+s.charAt(0));
        gss(s.substring(1),ans);
    }

    
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String s=scan.nextLine();
    gss(s, "");
    }
    
}
