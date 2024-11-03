package DataStructure;

public class BinaryTree {
    TreeNode root;

    public void inorderPrint() {
        inorderPrint(root);
    }

    public void inorderPrint(TreeNode r) {
        if (r == null) {
            return;
        }

        inorderPrint(r.leftChild);
        System.out.print(" " + r.data );
        inorderPrint(r.rightChild);
    }

    public void preorderPrint(TreeNode r) {
        if (r == null) {
            return;
        }

        System.out.println(" " + r.data );
        inorderPrint(r.leftChild);
        inorderPrint(r.rightChild);
    }
}
