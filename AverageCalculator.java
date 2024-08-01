//Write a Java program calculates the average of a series of numbers entered by the user.
//The input ends when the user enters the number 0

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some numbers and enter zero: ");

        int data;
        data = input.nextInt();
        int sum = 0;
        int count = 0;
        double avg;
        while (data !=0)  {
            sum += data;
            count++;
            data = input.nextInt();
        }
        avg = (double)sum / count;
        System.out.println("Average: " + avg);
    }
}
