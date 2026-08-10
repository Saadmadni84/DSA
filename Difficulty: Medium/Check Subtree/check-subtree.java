/* Structure of binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}*/
class Solution {
    public boolean isSubTree(Node T, Node S) {
        if (S == null) return true;
        if (T == null) return false;

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        ser(T, a);
        ser(S, b);

        int n = b.size();
        int[] l = new int[n];

        for (int i = 1, j = 0; i < n; i++) {
            while (j > 0 && !eq(b.get(i), b.get(j)))
                j = l[j - 1];

            if (eq(b.get(i), b.get(j)))
                j++;

            l[i] = j;
        }

        for (int i = 0, j = 0; i < a.size(); i++) {
            while (j > 0 && !eq(a.get(i), b.get(j)))
                j = l[j - 1];

            if (eq(a.get(i), b.get(j)))
                j++;

            if (j == n)
                return true;
        }

        return false;
    }

    void ser(Node x, ArrayList<Integer> a) {
        if (x == null) {
            a.add(null);
            return;
        }

        a.add(x.data);
        ser(x.left, a);
        ser(x.right, a);
    }

    boolean eq(Integer a, Integer b) {
        return a == null ? b == null : a.equals(b);
    }
}
