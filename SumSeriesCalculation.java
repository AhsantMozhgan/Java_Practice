//Write a Java program which calculates the sum of a specific series:

public class SumSeriesCalculation {
    public static void main(String[] args) {
        double sum = 0;
        int a = 1;
        double item = (double) a / (a + 2);
        while(a <= 11) {
            sum += item;
            a += 2;
            item = (double) a / (a + 2);
        }
        System.out.println(sum);

//        double sum = 0;
//        int a = 1;
//        double b = (double)(a + 2);
//        double item = (double) a / b;
//        while(a <= 11) {
//            sum += item;
//            a += 2;
//            b += 2;
//            item = (double) a / b;
//        }
//        System.out.println(sum);
    }
}
