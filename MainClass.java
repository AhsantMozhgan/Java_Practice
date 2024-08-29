public class MainClass {
    public static void main(String[] args) {
        CircleClass c1 = new CircleClass();
        System.out.println(c1.radius);

        // this is incorrect because we can not call a constructor more than once
//        c1.CircleClass();   // Error
    }
}
