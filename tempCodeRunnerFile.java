 int c=a.length-1;
        int j=a[0];
        for(int i=j;i<a.length;i++){
            if(j==c){
                return true;
            }
            else{
                j=j+a[i];
            }
            
        }
        return false;