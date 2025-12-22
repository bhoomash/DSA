import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    Node insert_bt(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (val < root.val)
            root.left = insert_bt(root.left, val);
        else
            root.right = insert_bt(root.right, val);

        return root;
    }

    void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
}

public class BinaryDft{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BinaryTree k = new BinaryTree();
        Node root = null;  

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = k.insert_bt(root, val); 
        }
        System.out.print("Inorder Traversal: ");
        k.inOrder(root);
        System.out.print("\nPreorder Traversal: ");
        k.preOrder(root);
        System.out.print("\nPostorder Traversal: ");
        k.postOrder(root);
    }
}
