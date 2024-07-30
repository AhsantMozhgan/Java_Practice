//write a Java program that calculates 2 to the power of 3 using the
// variables a and b, and incorporate a counter to keep track of the iterations

public class PowerCalculation {
    public static void main (String [] args) {
        int a = 2;
        int b = 3;
        int counter = 1;
        for (int i = 1; i <= b; i++) {
            counter = counter * a;
            System.out.println(counter);
        }
//        rewrite the program using a while loop to calculate 2^3
//        int a = 2;
//        int b = 3;
//        int counter = 1;
//        int i = 1;
//
//        while (i <= b) {
//            counter = counter * a;
//            System.out.println("Iteration " + i + ": " + counter);
//            i++;
//        }
//
//        System.out.println("\nFinal result: " + a + " to the power of " + b + " = " + counter);
    }
}



