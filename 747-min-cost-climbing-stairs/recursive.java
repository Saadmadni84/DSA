class Solution {

    public int minCostClimbingStairs(int[] c) {

        return Math.min(helper(c, 0), helper(c, 1));

    }

    private int helper(int [] c,int i){

        if(i>=c.length){

            return 0;

        }

        return (c[i] + Math.min(helper(c,i+1),helper(c,i+2)));

    }

}
