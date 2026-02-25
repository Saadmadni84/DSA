// User function Template for Java
class Solution {
    static String isPowerof3(int n) {
       if(n<=0){
            return "No";
        }
        if(n==1){
            return "Yes";
        }
        if(n%3!=0){
            return "No";
        }
        return isPowerof3(n/3);
    }
}