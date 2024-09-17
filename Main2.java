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

        System.out.println("Ali and Abbas: " + nameOne.compareTo(nameTwo)); // output: 10 (output is a positive number. in here the deference between 'l' and 'b' is 10 characters)
        // Ali < ali (because The numerical code of lowercase letters is bigger than the numerical code of uppercase letters)
        System.out.println("Ali and ali: " + "Ali".compareTo("ali"));

        // Ali < Ali Reza ( because Ali is the same in both but 'Ali Reza' is bigger because it continues after 'Ali'
        System.out.println("Ali and Ali Reza: " + "Ali".compareTo("Ali Reza"));

        // Ali = Ali
        System.out.println("Ali and Ali: " + "Ali".compareTo("Ali"));

        // compare with startsWith and endsWith
        String nameThree = "AliReza";
        System.out.println("startsWith: " + nameThree.startsWith("Ali"));   // output: true
        System.out.println("endsWith: " + nameThree.endsWith("Reza"));      // output: true

        // length()
        System.out.println("nameThree length is: " + nameThree.length());

        // charAt(#)
        String name4 = "Ali Reza";
        for (int i = 0; i < name4.length(); i++) {
            System.out.println(name4.charAt(i));
        }

        // concat method
        String name5 = name4.concat(" jan"); // or more easy way: String name5 = name4 + " jan";
        System.out.println("name is Ali Reza: " + name4);
        System.out.println("concat 'jan' to Ali Reza: " + name5);

        // substring
        System.out.println(name4.substring(4,7));

        // OR
        String message = "Welcome to Java".substring(0, 11) + "HTML";
        System.out.println(message);

        // toLowerCase
        System.out.println(name4.toLowerCase());

        // toUpperCase
        System.out.println(name4.toUpperCase());

        // trim
        String name6 = "     Ali Reza       ";
        System.out.println(name6);
        System.out.println(name6.trim());

        // replace
        System.out.println("replace 'A' instead of 'a': " + name4.replace('a', 'A'));
    }
}
