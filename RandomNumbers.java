// Write a java program to generate ten random numbers between 1 and 100, using Random class.
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("    " + (10 + (int)(Math.random() * 90)));
//            System.out.print("    " + (1 + (int)(Math.random() * 100)));
        }
    }
}
