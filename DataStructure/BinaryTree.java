package DataStructure;

public class BinaryTree {
    TreeNode root;

    public void inorderPrint() {
        inorderPrint(root);
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
