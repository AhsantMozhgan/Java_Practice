public class CircleClass {
    int radius;
    // default constructor
    CircleClass() {     // incorrect form: 'void CircleClass' because constructor does not return anything
        radius = 1;     // data type is declared in the CircleClass and no need to declare here
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

}
