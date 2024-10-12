package DataStructure;

public class Test {
    static long fact(int n) {
        if (n == 0)
            return 1;

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
       // fact(3);
        System.out.println(fact(3));
    }
}
