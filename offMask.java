public class offMask {
    public static void main(String[] args) {
        
        int j=36;
        int i=5;
        int offmask=~(1<<i);
        System.out.println(j & offmask);
        
        int tmask=1<<i;
        System.out.println(tmask ^ j);
    

    }
    
}
