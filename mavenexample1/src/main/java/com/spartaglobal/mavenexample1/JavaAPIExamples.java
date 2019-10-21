package com.spartaglobal.mavenexample1;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class JavaAPIExamples {





   public  void mathExamples(){
      System.out.println(Math.sqrt(25));
   }
   public void dateTimes(){
       LocalDate localDate = LocalDate.of(1982, 11, 9);
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
       System.out.println(localDate.getDayOfWeek());
   }
}


//private TimerTask timerTask(){
//        return new TimerTask() {
//            @Override
//            public void run() {
//
//            }
//    System.out.println("here is a robot");
//}
//    public void timerExample(){
//        Timer timer = new Timer(true);
//        timer.schedule(timerTask(());
//    }
//}
