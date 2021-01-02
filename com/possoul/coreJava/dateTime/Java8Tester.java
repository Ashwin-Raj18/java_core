package com.possoul.coreJava.dateTime;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Java8Tester {

   public static void main(String args[]) throws ParseException {
      Java8Tester java8tester = new Java8Tester();
      java8tester.testLocalDateTime();
   }
	
   public void testLocalDateTime() throws ParseException {
      // Get the current date and time
      LocalDateTime currentTime = LocalDateTime.now();
      System.out.println("Current DateTime: " + currentTime);
		
      LocalDate date1 = currentTime.toLocalDate();
      System.out.println("date1: " + date1);
		
      Month month = currentTime.getMonth();
      int day = currentTime.getDayOfMonth();
      int seconds = currentTime.getSecond();
		
      System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);
		
      LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
      System.out.println("date2: " + date2);
		
      //12 december 2014
      LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
      System.out.println("date3: " + date3);
		
      //22 hour 15 minutes
      LocalTime date4 = LocalTime.of(22, 15);
      System.out.println("date4: " + date4);
		
      //parse a string
      LocalTime date5 = LocalTime.parse("20:15:30");
      System.out.println("date5: " + date5);
      
      
      
      LocalDate dt = LocalDate.of(2020, 12, 25);
      System.out.println("7  :"+dt.getDayOfWeek());
      System.out.println("8  :"+dt.getMonth());
      
      
      
      
      
      ZonedDateTime date9 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Kolkata]");
      System.out.println("9   : " + date9);
      
      ZonedDateTime date10 = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
      System.out.println("10   : " + date10);
      
      SimpleDateFormat sdf = new SimpleDateFormat( "dd-mm-yyyy HH:mm:ss");
      System.out.println("11  :"+sdf.parse("10-01-2018 01:10:20"));
      Date date11 = sdf.parse("10-01-2018 01:10:20");
      
      Calendar calendar1 = Calendar.getInstance();
      calendar1.setTime(date11);
      System.out.println("12   :"+ calendar1.get(Calendar.HOUR_OF_DAY));
      
      
      System.out.println("13 :"+LocalDateTime.of(2020,12,25,01,25,50));
    
      
   }
}