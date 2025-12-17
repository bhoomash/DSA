class Node{
    int val;
    Node left;
    Node right;
    
    Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    Node insert_bt(Node root,int val){
        if(root==null)return new Node(val);
        if(val<root.val){
            root.left=insert_bt(root.left,val);
        }else{
            root.right=insert_bt(root.right,val);
        }
        return root;    
    }
    void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print("-"+root.val);
        inOrder(root.right);
    }
    void preOrder(Node root){
        if(root==null)return;
        System.out.print("-"+root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);   
        System.out.print("-"+root.val);
    }
}
public class binaryDft{
    public static void main(String args[]){
        BinaryTree k=new BinaryTree();
        Node root=new Node(5);
        root=k.insert_bt(root,1);
        root=k.insert_bt(root,7);
        
        // k.inOrder(root);
        
        // k.preOrder(root);
        
        k.postOrder(root);
    }
}