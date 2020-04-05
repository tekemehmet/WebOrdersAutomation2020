package com.weborders.utilities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeUtilities {

    /**
     * This method returns current date as a String
     * Provide a format as a parameter
     *  MM -to specify months like  01 , 02, 03
     *  MMM - Jan ,Feb, Mar
     *  dd - to specify day, like 01, 02, 03
     *
     *  yyyy - to specify year like 2010, 2020
     * @param format for example : MMM dd, yyy= Mar 29, 2020
     * @return current date as a string
     */
    public static String getCurrentDate(String format){

        return LocalDate.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));

    }

    /**
     * This method returns difference between and and start time
     * @param start
     * @param end
     * @param format
     * @return
     */

    public static long getTimeDifference(String start, String end, String format){
        LocalTime startTime = LocalTime.parse(start,DateTimeFormatter.ofPattern(format));
        LocalTime endTime = LocalTime.parse(end,DateTimeFormatter.ofPattern(format));


        return ChronoUnit.HOURS.between(startTime,endTime);

    }


}
