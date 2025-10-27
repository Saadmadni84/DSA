import java.util.ArrayList;

class stack{
    ArrayList<Integer> al;
    int top;
    public stack(){
        this.al =new ArrayList<>();
        this.top =-1;
    }
    void push(int element){
        this.al.add(element);
    }
    int pop() {
    try {
        int last = al.size() - 1;
        int t = this.al.get(last);
        this.al.remove(last);
        return t;
    } catch (Exception e) {
        System.out.println("stack is empty");
        return -1;
    }
}
}
public class introstack {
    public static void main(String [] args){
        stack s=new stack();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());    
    }
    
}
