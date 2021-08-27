package aData.types.m6.l5;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesAndTimesPart2 {

    public static void main(String[] args) {
        System.out.println("\n** Dates and Times - Part 2 **\n");

        /**
         *      You can create your OWN PATTERN for creating a DateTime formatter
         *
         *          The PATTERN use a FIXED set of chars, both letters and some punctuation,
         *      AS SYMBOLS to DETERMINE how the date should be FORMATTED
         */

        // Monday, October 31, 2022 at 09:45
        LocalDateTime localDateTime = LocalDateTime.of(2022, 10, 31, 9, 45);

        var pattern = DateTimeFormatter.ofPattern("EEEE, LLLL dd, yyyy 'at' hh:mm");

        String dateTimeString = localDateTime.format(pattern);
        System.out.println(dateTimeString); // Monday, October 31, 2022 at 09:45


        LocalTime localTime = LocalTime.of(9, 45, 00, 00);
         dateTimeString = localDateTime.format(pattern); // UnsupportedTemporalTypeException, because the localTime, does not have a YEAR, MONTH or DAY


    }
}
