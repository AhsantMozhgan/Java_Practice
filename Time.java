//
 public class Time {
    private int hours, minutes, seconds;

    public Time() {

    }

    // Method with one parameter
    public Time(int h) {
        if (0 <= h && h < 24) {
            hours = h;
        }
    }

    // Method with two parameter
    public Time(int h, int m) {
        if (0 <= h && h < 24) {
            hours = h;
        }
        if (0 <= m && m < 24) {
            hours = m;
        }
    }

    // Method with three parameter
     public Time(int h, int m, int s) {
        if (0 <= h && h < 24) {
            hours = h;
        }
        if (0 <= m && m < 24) {
            hours = m;
        }
        if (0 <= s && s < 24) {
            hours = s;
        }
    }


}
