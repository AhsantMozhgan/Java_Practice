import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        // String class
//        String name = "Ali";  // refer to 'Ali'
//        name = "Korosh";      // refer to 'Korosh' and do not refer to 'Ali' anymore
//        name = "Ali";         // refer to 'Ali' again

        Scanner input = new Scanner(System.in);
        // Example for 'next()'
        System.out.println("Write something: ");
        String name = input.next(); // For example, write: 'How are you', and output is: 'How'
        System.out.println(name);
    }
}
