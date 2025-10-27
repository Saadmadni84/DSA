import java.util.*;
class stock{
    static void solution2(int [] a){
      Stack<Integer> stack = new Stack<>();
       for(int i=0;i<a.length;i++){
        //10,,14,9,25
        while(!stack.isEmpty() && a[stack.peek()]<a[i]){
            stack.pop();
        }
        if(stack.isEmpty()){
            System.out.println(i+1);
        }
        else{
            System.out.println(i-stack.peek());

        }
        stack.push(i);
       }
    }
    

}
public class stockspan {
    public static void main(String [] args){
        stock s=new stock();
        int [] a={10,11,14,9,25};
        s.solution2(a);
    }
}
