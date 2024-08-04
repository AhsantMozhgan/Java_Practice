public class MethodPractice {
    public static void Sum(int start, int stop) {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum += i;
//            System.out.println("Sum is :" + sum);
        }
        System.out.println("Sum is :" + sum);
    }

    public static void main(String[] args) {
        Sum(1,10);
        Sum(11,20);


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
