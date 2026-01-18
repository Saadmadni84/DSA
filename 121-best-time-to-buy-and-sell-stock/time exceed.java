int max=0;
        for(int i=0;i<p.length;i++){
            for(int j=i;j<p.length;j++){
                int diff=p[j]-p[i];
                if(diff>max){
                    max=diff;
                }
            }
        }
        return max;
