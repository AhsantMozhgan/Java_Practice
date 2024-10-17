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

    public static void main(String[] args) {
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);      // error because we can not push more than 2 items in here (Stack stack = new Stack(2);)
    }
}
