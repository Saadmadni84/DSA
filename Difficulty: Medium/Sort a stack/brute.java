class Solution {
    public void sortStack(Stack<Integer> st) {
     int [] arr=new int[st.size()];
     int s=st.size();
     for(int i=0;i<s;i++){
         arr[i]=st.pop();
     }
     Arrays.sort(arr);
     for(int i=0;i<arr.length;i++){
         st.push(arr[i]);
     }
    }
}
