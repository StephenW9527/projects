package com.tom.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
    //JAVA8
        Instant instant = Instant.now(); //格林威治標準時間
        System.out.println(instant);



//        java();
     }

    private static void java() {
        Date date = new Date();
        System.out.println(date);  //現在目前當下時間

        System.out.println(date.getTime());  //內部使用long 1970/1/1 00:00:00 至今的ms  用getTime 取得毫秒數

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss"); //日期格式轉換器
        System.out.println(sdf.format(date));

        String s = "2019/06/07  08:00:00";   // String --->Date

        Date other = null;
        try {
//            Date other = sdf.parse(s);  //String to Date 要處理例外
            other=sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        System.out.println(other);   若要在try catch外取得other  則要在外面先定義other
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,12);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,5);
        System.out.println(calendar.getTime());
    }
}
