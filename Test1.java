public class Test1 {
    public static void main (String [] args) {
        int a, b;
        int count;
        int i;
        a = 2;
        b = 3;
        count = 1;
//        int x = 5 * (3 / 2) + 2 * 3;
//        System.out.println(x);
//        x = 33;
//        System.out.println(x);

        final int x = 5 * (3 / 2) + 2 * 3;
        System.out.println(x);
//        x = 33;       // error because of final
    }
}
