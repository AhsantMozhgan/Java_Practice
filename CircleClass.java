public class CircleClass extends Shape {
    // static definition
    private static int numOfCircles;
    public static final double PI = 3.14;  // 'final' is public because we can not change it, and it can be seen from outside class

    private int radius;
    // default constructor
    public CircleClass() {     // incorrect form: 'void CircleClass' because constructor does not return anything
//        radius = 1;     // data type is declared in the CircleClass and no need to declare here
        this(1);    // calling another constructor inside this constructor
//        this.color = color;         // Illegal because this attribute is private in the Shape class
//        this.filled = filled;       // Illegal because this attribute is private in the Shape class
    }

    // constructor with one parameter
    public CircleClass(int r) {
        // we add 'numOfCircles++;' in here because this constructor with parameter is called in the constructor with no parameter(default constructor)
        numOfCircles++;
        radius = r;
    }

    // OR
//   public CircleClass(int r) {
//        if (r > 0) {
//            radius = r;
//        } else {
//            radius = 1;
//        }
//    }

    // 'numOfCircles' is static, and it is better to create static method for it
    // we do not create set method for 'numOfCircles' because we don't want to make any changes from outside this class
    public static int getNumOfCircles() {
//        radius++;   // error because we can't use none static attribute in a static method
        return numOfCircles;
    }

    // Using getter if we want to know the radius (return the value of radius)
    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        if (r > 0) {
            radius = r;
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
