import java.util.Stack;
class decode{
   public String dString(String q){
    Stack<String> s = new Stack<>();
        Stack<Integer> n = new Stack<>();
        String s1 = "";
        int n1 = 0;

        for (int i = 0; i < q.length(); i++) {
            char ch = q.charAt(i);

            if (Character.isDigit(ch)) {
                n1 = n1 * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                n.push(n1);
                s.push(s1);
                n1 = 0;
                s1 = "";
            } 
            else if (ch == ']') {
                int n = n.pop();
                StringBuilder temp = new StringBuilder(s.pop());
                temp.append(s1.repeat(n));
                s1 = temp.toString();
            } 
            else {
                s1 += ch;
            }
        }

        return s1;

   }
}




public class decodestring {
    public static void main(String [] args){
        decode d=new decode();
        String s="3[a2[c]]";
        String res=d.dString(s);
        System.out.println(res);
    }
    
}
