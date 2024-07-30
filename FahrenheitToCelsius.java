import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // celsius = (5/9)(fahrenheit - 32)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32); //  we use 5.0/9 because 5/9=0
        System.out. println("Fahrenheit " + fahrenheit + " is fahrenheit" + celsius + "in Celsius");
    }
}
