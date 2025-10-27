class Tnode{
    int val;
    Tnode left;
    Tnode right;
    Tnode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class Treeimplentation {
    Tnode root=null;
    root=new Tnode(0);
    root.left=new Tnode(20);
    root.right=new Tnode(30);
    root.left.left=new Tnode(40);
}
