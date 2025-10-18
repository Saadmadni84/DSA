public class queueA {
   public static class imq{
        int [] arr =new int[100];
        int f=-1;
        int r=-1;
        int size=0;
        public void add(int val){
            if(f==-1){
                f=0;
                r=0;
                arr[0]=val;
            }
            else{
                
                
                arr[++r]=val;
            }
            size++;
        }
        public int peeke(){
            return arr[f];
        }
            
        public int del(){
            if(size==0){
                return -1;
            }
            else{
                size--;
                f++;
                return arr[f-1];
            }
        }
        public void dis(){
            if(size==0){
                System.out.println("queue is empty");
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
    public static void main(String [] args){
        imq q=new imq();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.err.println(q.peeke());
        System.err.println( q.del());
        q.dis();

    }
}
