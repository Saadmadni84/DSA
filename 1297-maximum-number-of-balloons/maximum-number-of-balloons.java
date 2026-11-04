class Solution {
    public int maxNumberOfBalloons(String text) {
        int [] arr=new int[7];
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c=='b'){
                arr[0]++;
            }
            else if(c=='a'){
                arr[1]++;
            }
             else if(c=='l' && arr[3]-arr[2]==0){
                arr[2]++;
            }
             else if(c=='l'){
                arr[3]++;
            }
             else if(c=='o' && arr[5]-arr[4]==0){
                arr[4]++;
            }
             else if(c=='o'){
                arr[5]++;
            }
             else if(c=='n'){
                arr[6]++;
            }
        }
        Arrays.sort(arr);
        return arr[0];
    }
}