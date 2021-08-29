package aData.types.m6.l5;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesAndTimesPart1 {

    public static void main(String[] args) {
        System.out.println("\n** Dates and Times - Part 1 **\n");

        /*
         *       When you use local date & time, you DO NOT SPECIFY the TIME ZONE. It's IMPLICIT in YOUR LOCALE
         *
         */
        LocalDate localDate = LocalDate.now();

        LocalTime localTime = LocalTime.now();


        LocalDateTime localDateTime = LocalDateTime.now();

        /*
         *      When you use the ZonedDateTime, YOU CAN SPECIFY the TIME ZONE
         */

        ZonedDateTime zonedDateTime = ZonedDateTime.now();


        /*
                    Arbitrary date & times can be created using the
                            .of()
         */
        localDate = LocalDate.of(2022, 10, 31);
        System.out.println(localDate); // 2022-10-31 (this is the DEFAULT String FORMAT)

        localTime = LocalTime.of(9, 45, 00, 00);
        System.out.println(localTime); // 09:45

        /*                  the 'T' from OUTPUT SEPARATES the DATE from the TIME            */
        localDateTime = LocalDateTime.of(2022, 10, 31, 9, 45);
        System.out.println(localDateTime); // 2022-10-31T09:45


        /*    The ACCEPTED time zones that goes ar param in ZoneId.of(),
        *   comes from the Internet Assigned Number Authority, TIME ZONE DATABASE
         */
        zonedDateTime = ZonedDateTime.of(2022, 10, 31, 9, 45, 00, 00, ZoneId.of("America/Chicago"));
        System.out.println(zonedDateTime); // 2022-10-31T09:45-85:00[America/Chicago]


        /*
                    FORMATTING the DATE & TIME
         */

        String dateTimeString = ""
                + localDateTime.getDayOfWeek() + " "
                + localDateTime.getMonth() + " "
                + localDateTime.getDayOfMonth() + " "
                + localDateTime.getYear() + " at "
                + localDateTime.getHour() + ":"
                + localDateTime.getMinute();

        System.out.println(dateTimeString); // MONDAY OCTOBER 31 2022 at 9:45


        /*
            Using DaeTime Formatter
         */

        dateTimeString = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(dateTimeString); // 2022-10-31T09:45:00

        String str = localTime.format(DateTimeFormatter.ISO_LOCAL_DATE); // it's not the proper formatter for LocalTime
//        System.out.println(str); // UnsupportedTemporalTypeException






    }
}
