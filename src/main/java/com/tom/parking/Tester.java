package com.tom.parking;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Tester {
    private LocalDateTime enter;

    public static void main(String[] args) {

        LocalDateTime enter = LocalDateTime.of(2019,6,3,12,00,00);
        LocalDateTime leave = LocalDateTime.of(2019,6,3,14,00,00);
        Car car = new Car("AA-0001", enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long) Math.ceil( car.getDuration()/60.0);
        System.out.println(hours);
        System.out.println(30*hours + "元");
//             JAVA8();
//             java();
//        international();

    }

    private static void international() {

        //Gregorian 物件  日期跟星期要-1 +1  Java8的LocalDateTime.of() 則不用
//        Calendar cal = new GregorianCalendar(2018,3,10);
//        System.out.println(cal.getTime());

        //國際化
        DateFormat dateFormat = DateFormat.getInstance();
        TimeZone tz = TimeZone.getTimeZone("Japan");
        dateFormat.setTimeZone(tz);
        System.out.println(tz.getDisplayName());

        String dfu = dateFormat.format(new  java.util.Date());
        System.out.println(dfu);
    }

    private static void JAVA8() {
        Instant instant = Instant.now(); //格林威治標準時間
        System.out.println(instant);
        //Localxxxxxxx
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));

        LocalDateTime other = LocalDateTime.of(2018,11,10,20,0,0);
        System.out.println(other);
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
