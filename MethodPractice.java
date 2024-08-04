public class MethodPractice {
    //    In Java, the conventional naming rule for methods is to use camelCase, where the first
    //    letter is in lowercase and the first letter of each subsequent word is in uppercase.
    public static void sum1(int start, int stop) {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum += i;
//            System.out.println("Sum is :" + sum);
        }
        System.out.println("Sum is :" + sum);
    }

    public static void main(String[] args) {
        sum1(1,10);
        sum1(1,20);


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
