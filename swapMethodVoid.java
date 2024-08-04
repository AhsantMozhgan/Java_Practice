
public class swapMethodVoid {
    public static void swap(int x, int y) {
        // Call by value: (From main method) value of "a" copy into x, value of "b" copy into y
        // x value copy into the temp,
        int temp = x;
        // y value copy into the x,
        x = y;
        // temp value copy into the y
        y = temp;
        System.out.println("new value of 'a' (inside the swap method) : " + x);
        System.out.println("new value of 'b' (inside the swap method) : " + y);
        System.out.println();
    }

    public static void main(String[] args) {
        // variables x and y does not exit into the main method,
        // so we declare variable a and b inside the main method
        int a = 2, b = 4;
//        Call by value: value of a copy into x, value of b copy into y
        swap(a, b);
        System.out.println("Initial value of 'a' (inside the main method) : " + a);
        System.out.println("Initial value of 'b' (inside the main method) : " + b);

    }
}
