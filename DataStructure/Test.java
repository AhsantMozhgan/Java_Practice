package DataStructure;

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
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);      // no error because we double the array length of s.length (int[] newArray = new int[2 * s.length];)
        stack.push(4);
        stack.push(5);
        stack.push(6);


        System.out.println(stack.getSize());
        System.out.println(stack.getCapacity());
    }
}
