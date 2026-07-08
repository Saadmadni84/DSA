class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        Stack<Integer> s=new Stack<>();
        s.push(arr[n-1]);
        n--;
        arr[n]=-1;
        if(n==0){
            return arr;
        }
        n--;
        while(n>=0){  
            int curr=arr[n];
            arr[n]=s.peek();  
            if(s.peek()<curr){
                s.push(curr);
            }
            n--;
           

        }
        return arr;

    }
}