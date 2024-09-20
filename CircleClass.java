public class CircleClass {
    // static definition
    private static int numOfCircles;

    private int radius;
    // default constructor
    public CircleClass() {     // incorrect form: 'void CircleClass' because constructor does not return anything
//        radius = 1;     // data type is declared in the CircleClass and no need to declare here
    this(1);    // calling another constructor inside this constructor
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
