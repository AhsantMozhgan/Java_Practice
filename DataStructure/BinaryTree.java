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
        System.out.println(" " + r.data );
        inorderPrint(r.rightChild);
    }
}
