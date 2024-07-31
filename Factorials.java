import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt ();
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;

//        OR using while loop
//        int i = 2;
//        while (i <= n) {
//            f = f * i;
//            ++i;
//        }
            System.out.println(i);

        }
        System.out.println (n + "! = " + f);


    }
}
