
 public class Time {
    private int hours, minutes, seconds;

     // "this" usage: for using another constructor inside body of another constructor
    public Time() {
    // we don't need to use "this" because there are no arguments to check
        // so no need to write 'this(0, 0, 0);'
    }

    // Method with one parameter
    public Time(int h) {
//        if (0 <= h && h < 24) {
//            hours = h;
//        }
//        we use Method with three parameter
        this(h, 0, 0);
    }

    // Method with two parameter
    public Time(int h, int m) {
//        if (0 <= h && h < 24) {
//            hours = h;
//        }
//        if (0 <= m && m < 24) {
//            hours = m;
//        }
//        we use Method with three parameter
        this(h, m, 0);
    }

//    // Method with three parameter
//     public Time(int h, int m, int s) {
//        if (0 <= h && h < 24) {
//            hours = h;
//        }
//        if (0 <= m && m < 24) {
//            minutes = m;
//        }
//        if (0 <= s && s < 24) {
//            seconds = s;
//        }
//    }

     // using 'this'
     // Method with three parameter
     public Time(int hours, int m, int s) {
         if (0 <= hours && hours < 24) {
             this. hours = hours;
         }
         if (0 <= m && m < 24) {
             minutes = m;
         }
         if (0 <= s && s < 24) {
             seconds = s;
         }
     }

     public Time(Time time) {
         hours = time.hours;
         minutes = time.minutes;
         seconds = time.seconds;
     }

    public void show() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public void secondIncrement() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }

        if (minutes == 60) {
            minutes = 0;
            hours++;
        }
        if (hours == 24) {
            hours = 0;
        }
     }


 }
