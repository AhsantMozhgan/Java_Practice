public class MainClass {
    public static void main(String[] args) {
        CircleClass c1 = new CircleClass();
//        System.out.println(c1.radius);
        System.out.println(c1.getRadius());

        c1.setRadius(3);
        System.out.println(c1.getRadius());

        c1.setRadius(-3);
        System.out.println(c1.getRadius());


        // this is incorrect because we can not call a constructor more than once
//        c1.CircleClass();   // Error

        // printing constructor with one parameter
        CircleClass c2 = new CircleClass(3);
//        System.out.println(c2.radius);

        // We just can see the value of an attribute like radius and we can not change its value
        // we used 'private' for radius in the CircleClass and write getRadius method to return the value of radius
        System.out.println("Read radius: " + c1.getRadius());


        // Show result for Time class
        Time t1 = new Time();   // by default is midnight 00:00
        Time t2 = new Time(7);          // 7 am
        Time t3 = new Time(7, 45);      // 7:45 am
        Time t4 = new Time(7, 45, 12);  // 7:45:12 am
    }
}
