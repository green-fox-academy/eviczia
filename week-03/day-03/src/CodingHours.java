public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        int hrPerDay = 6;
        int semWeeks = 17;

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.

        int sumCodinHours = hrPerDay * semWeeks * 5;
        System.out.println(sumCodinHours);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        double codeHrPercentPerWeek = 6. * 5. / 52. * 100;
        System.out.println(codeHrPercentPerWeek + " %");
    }
}
