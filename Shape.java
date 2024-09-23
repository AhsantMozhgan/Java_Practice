import java.awt.Color;

public class Shape {
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
}
