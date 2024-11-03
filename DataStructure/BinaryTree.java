package DataStructure;

public class BinaryTree {
    TreeNode root;

    public void inorderPrint() {
        inorderPrint(root);
    }

    public TreeNode copy(TreeNode r) {
        if (r == null) {
            return null;
        }
        TreeNode newRoot = new TreeNode(r.data);
        newRoot.leftChild = copy(r.leftChild);
        newRoot.rightChild = copy(r.rightChild);
        return  newRoot;
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
