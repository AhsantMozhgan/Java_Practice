package DataStructure;

import com.sun.source.tree.TreeVisitor;

public class BinaryTree {
    TreeNode root;

    public void inorderPrint() {
        inorderPrint(root);
    }

    public void preorderPrint() {
        preorderPrint(root);
    }

    // define default constructor
    public BinaryTree() {
    }

    // in the Test class we have error because when we define constructor with one parameter, the default constructor will not be created for us.
    // So we need to define a default constructor
    public BinaryTree(BinaryTree tree) {
        root = copy(tree.root);
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

    private static boolean equals(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return  true;
        }
        if (r1 != null && r2 != null
                && r1.data == r2.data
                && equals(r1.leftChild, r2.leftChild)
                &&equals(r1.rightChild, r2.rightChild)) {
            return true;
        }
        return false;
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

        System.out.print(" " + r.data );
        inorderPrint(r.leftChild);
        inorderPrint(r.rightChild);
    }
}
