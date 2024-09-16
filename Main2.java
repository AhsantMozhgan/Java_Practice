import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        // String class
//        String name = "Ali";  // refer to 'Ali'
//        name = "Korosh";      // refer to 'Korosh' and do not refer to 'Ali' anymore
//        name = "Ali";         // refer to 'Ali' again

        Scanner input = new Scanner(System.in);
//        // Example for 'next()'
//        System.out.println("Write something: ");
//        String name = input.next(); // For example, write: 'How are you', and output is: 'How'
//        System.out.println(name);

//        // Example for 'nextLine()'
//        System.out.println("Write something for nextLine(): ");
//        String name2 = input.nextLine(); // For example, write: 'How are you', and output is: 'How are you'
//        System.out.println(name2);

//        if you call any method in a string, string's content will not change

        String nameOne = "Ali Reza";
        String nameTwo = new String("Ali Reza");
//        if (nameOne == nameTwo) {      // this is not a correct way and output is nothing
        if (nameOne.equals(nameTwo)) {   // this is a correct way and output would be 'he strings are equal'
            System.out.println("The strings are equal");
        }

    }
}
