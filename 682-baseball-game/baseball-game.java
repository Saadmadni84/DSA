class Solution {
    public int calPoints(String[] op) {
        Stack<String> s=new Stack<>();
        int i=0;
        while(i<op.length){
            String c = op[i];
           if (c.equals("C")) {
                s.pop();
            }
            else if (c.equals("D")) {
                int a = Integer.parseInt(s.peek());
                int f = a * 2;
                String str = Integer.toString(f);
                s.push(str);
            }
            else if (c.equals("+")) {
                int a = Integer.parseInt(s.pop());
                int b = Integer.parseInt(s.peek());
                String ctr = Integer.toString(a);
                s.push(ctr);
                int f = a + b;
                String str = Integer.toString(f);
                s.push(str);
           }
           else{
              s.push(c);
           }
           i++;
        }
        int sum=0;
        while(!s.isEmpty()){
            int a = Integer.parseInt(s.pop());
            sum=sum+a;
        }
        return sum;
    }
}