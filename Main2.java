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

//        String nameOne = "Ali Reza";
//        String nameTwo = new String("Ali Reza");
//        if (nameOne == nameTwo) {      // this is not a correct way and output is nothing
//        if (nameOne.equals(nameTwo))   // this is a correct way and output would be 'he strings are equal'
//            System.out.println("The strings are equal");
//            else
//            System.out.println("The strings are not equal");


//        // compare with ignore case
//        String nameOne = "ali Reza";
//        String nameTwo = new String("Ali Reza");
//        if (nameOne.equalsIgnoreCase(nameTwo))   // this is a correct way and output would be 'he strings are equal'
//            System.out.println("The strings are equal");
//        else
//            System.out.println("The strings are not equal");

        // compare with 'compareTo' (the result is zero or a positive number or a negative number, and it is not boolean)
        String nameOne = "Ali";
        String nameTwo = new String("Abbas");

        System.out.println(nameOne.compareTo(nameTwo)); // output: 10 (output is a positive number. in here the deference between 'l' and 'b' is 10 characters)
        // Ali < ali (because The numerical code of lowercase letters is bigger than the numerical code of uppercase letters)
        // Ali < Ali Reza ( because Ali is the same in both but 'Ali Reza' is bigger because it continues after 'Ali'
    }
}
