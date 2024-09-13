import testPackage.A;
public class MainClass {
//    public static void main(String[] args) throws InterruptedException {
//        CircleClass c1 = new CircleClass();
////        System.out.println(c1.radius);
//        System.out.println(c1.getRadius());
//
//        c1.setRadius(3);
//        System.out.println(c1.getRadius());
//
//        c1.setRadius(-3);
//        System.out.println(c1.getRadius());
//
//
//        // this is incorrect because we can not call a constructor more than once
////        c1.CircleClass();   // Error
//
//        // printing constructor with one parameter
//        CircleClass c2 = new CircleClass(3);
////        System.out.println(c2.radius);
//
//        // We just can see the value of an attribute like radius and we can not change its value
//        // we used 'private' for radius in the CircleClass and write getRadius method to return the value of radius
//        System.out.println("Read radius: " + c1.getRadius());
//
//
//        // Show result for Time class
////        Time t1 = new Time();   // by default is midnight 00:00
//        Time t4 = new Time(7, 45, 12);  // 7:45:12 am
//        Time t5 = new Time(t4);
//
//        t4.show();
//        t5.show();
//        /*
//        Time t2 = new Time(7);          // 7 am
//        Time t3 = new Time(7, 45);      // 7:45 am
//        Time t4 = new Time(7, 45, 12);  // 7:45:12 am
//        t1.show();
//        t2.show();
//        t3.show();
//        t4.show();
//        */
//
//
//        /*
//        while (true) {
//            t1.show();
////            Thread.sleep(1000);
////            Thread.sleep(100);
////            Thread.sleep(10);
//            Thread.sleep(1);
//            t1.secondIncrement();
//*/
//
//
//        // t6 is a copy of t5 in a new location
////            Time t5 = new Time(2, 10, 20);
////            Time t6 = new Time(t5);
////        }
//    }


    // this is for Test class
     public static void main(String[] args) {
        int a = 1;
        Test test = new Test();
        change(a, test);
         System.out.println(a);         // output: 1
         System.out.println(test.a);    // output: 3
    }

    public static void change(int a, Test b) { // a is a number and b is an object from Test class
        // we write static to do not build object when we want to call this method

        // 'int a' is primitive type (if we change primitive the main argument will not change)
        // 'Test b' is reference type

        a = 3;  // 'a' is primitive type (if we change primitive the main argument will not change)
        // 'b' is reference type (if we change b's attribute, the main object from Test class will change)
        b.a = 3;    // 'b' is an object from Test class and Test class has an attribute called 'a'.
    }

    // test private, public, protected and default access
//    A a = new A();      // error because a is private in class A

    // to have no error we need to write 'import testPackage.A;' or 'import testPackage.*; at top of the code'
    A a1 = new A();
//     a1.a = 2;   // error (private access)
//     a1.b = 2;    // public access
//     a1.c = 2;     // error (default access)

}
