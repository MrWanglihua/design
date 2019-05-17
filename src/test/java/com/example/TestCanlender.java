package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestCanlender {
    public static void main(String[] args) throws ParseException {

        String d1 = "20150217";
        String d2 = "20150317";


        /* 先转成毫秒并求差 */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        long m = sdf.parse(d2).getTime() - sdf.parse(d1).getTime();
        System.out.println("相差毫秒数:"+ m );
        System.out.println("相差天数:"+ ( m / (1000 * 60 * 60 * 24) ) );

    }
}
