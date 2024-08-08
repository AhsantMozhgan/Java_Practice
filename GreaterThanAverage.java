import java.util.Scanner;

public class GreaterThanAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you enter? ");

        int N = input.nextInt();
        int [] a = new int [N];
//        int [] a = new int [5];
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
        System.out.println("aboveAverage : " + aboveAverage);

    }
}
