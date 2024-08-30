public class CircleClass {
    private int radius;
    // default constructor
    CircleClass() {     // incorrect form: 'void CircleClass' because constructor does not return anything
//        radius = 1;     // data type is declared in the CircleClass and no need to declare here
    this(1);    // calling another constructor inside this constructor
    }

    // constructor with one parameter
    CircleClass(int r) {
        radius = r;
    }

    // OR
//    CircleClass(int r) {
//        if (r > 0) {
//            radius = r;
//        } else {
//            radius = 1;
//        }
//    }

    // Using getter if we want to know the radius (return the value of radius)
    int getRadius() {
        return radius;
    }


}
