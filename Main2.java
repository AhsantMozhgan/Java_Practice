import java.awt.*;
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

        // replaceAll
        System.out.println("replace All: " + name4.replaceAll("Ali", "taghi")); // taghi Reza
        System.out.println(name4);

        System.out.println("replace First: " + name4.replaceFirst("ali", "taghi")); // taghi Reza
        System.out.println(name4);

        // split
        String fullName = "Mr. Jack D. Brown";
        String [] nameParts = fullName.split(" ");     // output: Mr.
                                                             //         Jack
                                                             //         D.
                                                             //         Brown

//        String [] nameParts = fullName.split("  ");     // output: Mr. Jack D. Brown
        for (int i = 0; i < nameParts.length; i++) {
            System.out.println(nameParts[i]);
        }

        // indexOf
        String name7 = "ali Reza";
        System.out.println("indexOf('a') in 'Ali Reza' is: " + name7.indexOf('a'));             // search from left side
        System.out.println("indexOf('a') in 'Ali Reza' is: " + name7.lastIndexOf('a'));     // search from left side

        System.out.println(name7.substring(name7.indexOf('R')));    // output: Reza

        // it starts from index 1 instead of 0 (left to right)
        System.out.println("indexOf('a') in 'Ali Reza' (from index 1) is: " + name7.indexOf('a', 1));       // 7

        // it starts from last index (from right to left), searching backward from specify index (from index 1)
        System.out.println("indexOf('a') in 'Ali Reza' (from last index of #1) is: " + name7.lastIndexOf('a', 1));   // 0

        // it starts from last index (from right to left), searching backward from specify index (from index 7)
        System.out.println("indexOf('a') in 'Ali Reza' (from last index of #7) is: " + name7.lastIndexOf('a', 7));   // 7

        // it starts from last index (from right to left), searching backward from specify index (from index 6)
        System.out.println("indexOf('a') in 'Ali Reza' (from last index of #7) is: " + name7.lastIndexOf('a', 6));   // 0

        String name8 = "ali Reza ali Naghi";
        System.out.println("indexOf('ali') in 'ali Reza ali Naghi' is: " + name8.indexOf("ali"));  // 0
        System.out.println("indexOf('ali') in 'ali Reza ali Naghi' is: " + name8.indexOf("ali", 1));  // 9
        System.out.println("indexOf('ali') in 'ali Reza ali Naghi' is: " + name8.lastIndexOf("ali", 1));  // 0
        System.out.println("indexOf('ali') in 'ali Reza ali Naghi' is: " + name8.lastIndexOf("ali", 8));  // 0



        int j = 2;
//        Integer a = new Integer(2);   // instead we can write this: Integer a = 2;
        Integer a = 2;

//        int i = a.intValue();           // instead we can write this: int i = a;
        int i = a;

        String str = "123";
        int i1 = Integer.parseInt(str);
        System.out.println(i1);

        // we do not need to create an object from CircleCClass because 'getNumOfCircles()' is static
        System.out.println("Number of circle is: " + CircleClass.getNumOfCircles());      // 0

        new CircleClass();
        new CircleClass(3);
        System.out.println("Number of circle is: " + CircleClass.getNumOfCircles());      // 2

        System.out.println(CircleClass.PI);

        // for inheritance
        CircleClass c1 = new CircleClass();
        // 'getColor()' is in Shape class, and it is public, so we can access to it in here
        System.out.println(c1.getColor());  // java.awt.Color[r=255,g=0,b=0]

        // calling from this constructor: 'CircleClass (Color color, boolean filled, int radius)'
        CircleClass c2 = new CircleClass(Color.yellow, true, 3);
        System.out.println(c2.getColor());      // java.awt.Color[r=255,g=255,b=0]

        // for showing overriding method
//        Shape s = new Shape(Color.blue, true);      // we can not create a new instance from an abstract class (but we can create a new instance from its subclasses)
//        s.print();  // color: java.awt.Color[r=0,g=0,b=255]isFilled: true
//        System.out.println();

        // CircleClass is subclass of Shape
        CircleClass circle = new CircleClass(2);
//        circle.print(); // color: java.awt.Color[r=255,g=0,b=0]isFilled: false
        // override print(). print method in subclass (CircleClass) is override from superclass (Shape) and print 'radius' now
        System.out.println("override print() method: ");
        circle.print(); // color: java.awt.Color[r=255,g=0,b=0]isFilled: false radius: 2

        // by pressing 'CTRL + left click' we go to the Object class which is super class of all classes
        // toString() method is in the Object class
//        Object
        System.out.println("calling toString(): ");
        System.out.println(circle.toString());

        // UpCasting (Implicit casting)
        double x = 2;
        System.out.println(x);  // 2


        // DownCasting (Explicit casting)
//        int y = 2.1;        // error
        int y = (int)2.1;      // using '(int)' to make the output integer type
        System.out.println(y);  // 2

        // UpCasting (Implicit casting) in object-oriented
//        CircleClass cc = new CircleClass();
        // it is better to code in this form and not this form: 'CircleClass cc = new CircleClass();'
        Shape cc = new CircleClass();   // the goal is to call attributes and methods that are in the Shape class (not in the CircleClass)
        cc.setColor(Color.blue);
        System.out.println(cc);

        // DownCasting (Explicit casting) in object-oriented
//        CircleClass cc1 = new Shape();  // error
//        CircleClass cc1 = (CircleClass) new Shape();    // this is not a good example of DownCasting because we will get error
//        System.out.println(cc1);        // error: class Shape cannot be cast to class CircleClass

//        Dog dog = new Dog("puppy");
//        dog.eat();
//        dog.bark();

        Animal animal1 = new Dog("puppy");
        Animal animal2 = new Cat("tom");
        Animal animal3 = new Animal("what");

        Animal.sound(animal1);      // vagh vagh
        Animal.sound(animal2);      // miooooo
        Animal.sound(animal3);      // ----------

        // show output for polymorphism definition
        animal1.makeSound();        // VAGH VAGH
        animal2.makeSound();        // MIOOOOOOOOO
        animal3.makeSound();        // ---makeSound----


//        Shape shape = new Shape();  // error because 'Shape' is abstract, and cannot be instantiated

        Shape s1 = new CircleClass();    // this is correct form because 'CircleClass' is subclass of 'Shape' (Shape is super class for CircleClass)
        System.out.println(s1.getArea());       // 3.141592653589793

        Shape s2 = new Square();
        System.out.println(s2.getArea());       // 1.0
    }
}
