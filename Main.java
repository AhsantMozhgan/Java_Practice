public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) { // for printing 10 circle
//            new Circle();
//            Circle c1= new Circle();    // this is similar to: int x = 5;
//        }
        Circle c1= new Circle();    // this is similar to: int x = 5;
        System.out.println(c1.radius); // output is 0

        c1.radius = 2;
        System.out.println(c1.radius);
        System.out.println(c1.getArea());

        Circle c2 = new Circle();
        c2.radius = 3;
        System.out.println(c2.radius);

        // System.out.println(c2.getArea());
        double area = c2.getArea();
        System.out.println(area);

//        Circle c3 = c1; // Address of c1 copies to c3. so c3 refer to the same object that c1 refers
//        System.out.println(c1);
//        System.out.println(c3);
//
//        System.out.println(c1.radius);  // output is 2
//        System.out.println(c3.radius);  // output is 2

        // this is the correct form for creating c3
        Circle c3 = new Circle();
//         c3.radius = 4;
        System.out.println(c3.radius);
        System.out.println(c3.getArea());

        System.out.println("Here 'c4.radius = 4;' is not used at all");
        Circle c4 = new Circle();
        c4.radius = 4;
        c4 = new Circle();
        System.out.println(c4.radius);
    }
}
