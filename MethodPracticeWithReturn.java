public class MethodPracticeWithReturn {
//    In Java, the conventional naming rule for methods is to use camelCase, where the first
//    letter is in lowercase and the first letter of each subsequent word is in uppercase.
    public static int sum2(int start, int stop) {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum += i;
        }
//        System.out.println("Sum is :" + sum);
        return sum;

    }

    public static void main(String[] args) {
        int i = sum2(1,10);
        int j = sum2(11,20);
        System.out.println("Sum of i is :" + i);
        System.out.println("Sum of j is :" + j);


//        int sum = 0;
//        for (int i =0; i <= 10; i++)
//            sum += i;
//        System.out.println("Sum is: " + sum);
//
//        sum = 0;
//        for (int i =0; i <= 20; i++)
//            sum += i;
//        System.out.println("Sum is: " + sum);
    }
}
