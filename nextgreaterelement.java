import java.util.*;
class gretertwo{
     public int[] nextGreaterElements(int[] a){
        Stack<Integer> s=new Stack<>();
        int [] res=new int[a.length];
        //3,9,4,0,2
        for(int i=a.length-1;i>=0;i--){
           while(!s.isEmpty()  && a[s.peek()]<a[i]){
            s.pop();
           }
           if(s.isEmpty()){
              res[i]=-1;
            } 
           else{
               res[i]=a[s.peek()]; 
           }
           s.push(i);
        }
       return res; 
     }
}
public class nextgreaterelement{
    public static void main(String [] args){
        gretertwo g=new gretertwo();
        int [] a={3,9,4,0,2};
        int [] res=g.nextGreaterElements(a);
        System.out.println(Arrays.toString(res));
    }
    
}
