public static double median(ArrayList<Integer> a, ArrayList<Integer> b) {
    ArrayList<Integer> arr3 = new ArrayList<>();
    int n1 = a.size(), n2 = b.size();
    int i = 0;
    int j = 0;
    
    while(i < n1 && j < n2) {
        if(a.get(i) < b.get(j)) arr3.add(a.get(i++));
        else arr3.add(b.get(j++));
    }
    
    while(i < n1) arr3.add(a.get(i++));
    while(j < n2) arr3.add(b.get(j++));
    
    int n = (n1 + n2);
    
    if(n % 2 == 1) {
        return arr3.get(n/2);
    }
    
    return (double)((double)(arr3.get(n/2)) + (double)(arr3.get(n/2 - 1))) / 2.0;
}
