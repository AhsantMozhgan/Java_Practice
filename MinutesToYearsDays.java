//Enter the number of minutes:1000000000
// 1000000000 minutes is approximaely 1902 years and 214 days. assume a year has 365 days.


import java.util.Scanner;

public class MinutesToYearsDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");

        long minutes;
        minutes = input.nextLong();

        long minutesInYear = 365 * 24 * 60; // minutes in a year

//      To get the number of years, we divide the total minutes by minutes in a year.
        long years = minutes / minutesInYear;

//      To get the remaining minutes, we use the modulo operator (%) with minutes in a year.
        long remainingMinutes = minutes % minutesInYear;

//      We then convert the remaining minutes to days by dividing by the number of minutes in a day (24 * 60).
        long days = remainingMinutes / (24 * 60); // remaining days

        // Output the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

        input.close();

    }

}
