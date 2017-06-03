package com.france193.polito;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    private static String pattern = "HH:mm - dd-MM-yy";

    public static void main(String[] args) {
        // define standard format
        DateFormat df = new SimpleDateFormat(pattern);

        // take time and save it
        Calendar now = Calendar.getInstance();
        String text1 = df.format(now.getTime());
        System.out.println(text1);

        // convert in long to store it
        Long nowLong = now.getTimeInMillis();
        System.out.println(nowLong.toString());

        // retrieve a new date and set it to previous time
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(nowLong);

        // print date
        String text2 = df.format(cal.getTime());
        System.out.println(text2);

        return;
    }
}
