package DataStructure;

import com.sun.source.tree.Tree;

public class Test {
//    static long fact(int n) {
//        if (n == 0)
//            return 1;
//
//        return n * fact(n - 1);
//    }
//
//    public static void main(String[] args) {
//       // fact(3);
//        System.out.println(fact(3));
//    }

//    public static void main(String[] args) {
//        Stack stack = new Stack(2);
//        stack.push(1);
//        System.out.println(stack.getSize());
//        stack.push(2);
////        stack.push(3);      // error because we can not push more than 2 items in here (Stack stack = new Stack(2);)
//        System.out.println(stack.getCapacity());
//    }

    // for doubling the array length of s
    public static void main(String[] args) throws StackEmptyException, ListEmptyException {
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);      // no error because we double the array length of s.length (int[] newArray = new int[2 * s.length];)
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.getSize());
        System.out.println(stack.getCapacity());

        while (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println("pop elements: " + element);
        }

        // for testing LinkedList
        // Print the exponent of 7 from 1 to 1000
        LinkedList list = new LinkedList();
//        for (int i = 7; i <= 1000; i+=7) {
//            list.addLast(i);
//        }

        list.add(0, 2);
        list.add(0, 3);
        list.add(1, 5);
        list.add(1, 7);
        list.add(2, 9);

        // for testing removeFirst() method
        System.out.println("removeFirst: " + list.removeFirst());

//        list.print();
        list.printAgain();


        // for testing merging 2 list in a new list
        System.out.println("Merging 2 list in a new list: ");
        LinkedList l1 = new LinkedList();
        l1.addLast(2);
        l1.addLast(9);

        LinkedList l2 = new LinkedList();
        l2.addLast(3);
        l2.addLast(7);
        l2.addLast(11);

        LinkedList l3 = LinkedList.merge(l1,l2);
        l1.printAgain();
        l2.printAgain();
        l3.printAgain();


        // test for TreeNode
        System.out.print("test for TreeNode: ");
        // in the Test class we need to define a default constructor

        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(2);
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(9);

        tree.root.leftChild = a;
        tree.root.rightChild = b;
        b.leftChild = c;
        b.rightChild = d;

        tree.inorderPrint();

    }
}
