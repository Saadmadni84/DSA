class Solution {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> s=new HashSet<>();
        for(String e:emails){
             int n=e.length();
            String te="";
            int i=0;
            while(i<n && e.charAt(i)!='@'){
                char c=e.charAt(i);
                  if(c=='.'){
                    i++;
                    continue;
                  }
                  if(c=='+'){
                    while(i<n && e.charAt(i)!='@'){
                        i++;
                    }
                    break;
                  }
                    te=te+c;
                  i++;

                }
                while (i < n) {
                te += e.charAt(i);
                i++;
            }
                s.add(te);

            }
        
        return s.size();
    }
}