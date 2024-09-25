import java.awt.Color;

//public class Shape {
public abstract class Shape {   // if a class has abstract method, the class itself must be declared as abstract too.
    private Color color;    // import java.awt.Color for Color class;
    private boolean filled;

    public Shape () {
        // color = new Color(int r, int g, int b);  // rgb
        // color = new Color(255, 0, 0);            // RED color
        color = Color.RED;
    }

    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Color getColor() {
        return color;
    }

    // for boolean we write isFilled() not getFilled()
    public boolean isFilled() {
        return filled;
    }


    public void setColor(Color color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void print() {
        System.out.print("color: " + color + "isFilled: " + filled);
    }

    @Override
    public String toString() {
//        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
        return  "color=" + color + ", filled=" + filled;
    }

//    public double getArea() {
//
//    }

    // abstract: if we want to write a method without body in a super class (Shape class in here), we declare that method as abstract
    abstract public double getArea();   // if a class has abstract method, the class itself must be declared as abstract too.
}
