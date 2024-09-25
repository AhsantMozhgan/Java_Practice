import java.awt.*;

public class Square extends Shape { // we must write getArea() method because 'getArea()' is an abstract method in the Shape class
    private  int side;
    public double getArea() {
        return  side * side;
    }

    public Square() {
        side = 1;
    }

    public Square(int side) {
        this.side = side;
    }

    public Square(int side, Color color, boolean filled) {  // import 'Color'
        super(color, filled);
        this.side = side;
    }
}
