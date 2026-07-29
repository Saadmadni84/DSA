class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
      ArrayList<ArrayList<Integer>> ls=new ArrayList<>();
      int sum=0;
      helper(arr,0,new ArrayList<>(),target,sum,ls);
      return ls; 
    }
    private void helper(int [] arr,int i,ArrayList<Integer> curr,int target,int sum,ArrayList<ArrayList<Integer>> ls){
        if(sum==target){
            ls.add(new ArrayList<>(curr));
            return;
        }
         if (sum > target) {
            return;
            }

        for(int f=i;f<arr.length;f++){
            curr.add(arr[f]);
            helper(arr,f,curr,target,sum+arr[f],ls);
            curr.remove(curr.size()-1);
        }
    }
}