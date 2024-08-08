//        Write a program that reads 100 numbers, computes their average,
//        and find out how many numbers are above the average.


import java.util.Scanner;

public class GreaterThanAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int N = input.nextInt();
        int [] a = new int [N];
//        int [] a = new int [5];
        System.out.println("Enter the numbers:");
        int sum = 0;
        for (int i = 0; i < a.length; i ++) {
            a[i] = input.nextInt();
            sum += a[i];
        }
        double avg = (double) sum / a.length;
        System.out.println("average: " + avg);

        int aboveAverage = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > avg)
                aboveAverage++;
        }
        System.out.println("Number of elements greater than the average: " + aboveAverage);

    }
}
