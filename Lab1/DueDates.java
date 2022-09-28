import java.time.LocalDateTime;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DueDates{
    public static void main(String[] args){
       int SECONDS_IN_A_DAY = 24 * 60 * 60;        
       Calendar lab1 = Calendar.getInstance();
       lab1.set(2022, Calendar.SEPTEMBER, 28, 14, 00, 00);
       Calendar today = Calendar.getInstance();
       long diff1 =  lab1.getTimeInMillis() - today.getTimeInMillis(); 
       long diffSec1 = diff1 / 1000;
       long days1 = diffSec1 / SECONDS_IN_A_DAY;
       long secondsDay1 = diffSec1 % SECONDS_IN_A_DAY;
       long seconds1 = secondsDay1 % 60;
       long minutes1 = (secondsDay1 / 60) % 60;
       long hours1 = (secondsDay1 / 3600);

       Calendar lab2 = Calendar.getInstance();
       lab2.set(2022, Calendar.OCTOBER, 26, 14, 00, 00);
       long diff2 =  lab2.getTimeInMillis() - today.getTimeInMillis(); 
       long diffSec2 = diff2 / 1000;
       long days2 = diffSec2 / SECONDS_IN_A_DAY;
       long secondsDay2 = diffSec2 % SECONDS_IN_A_DAY;
       long seconds2 = secondsDay2 % 60;
       long minutes2 = (secondsDay2 / 60) % 60;
       long hours2 = (secondsDay2 / 3600);

       Calendar lab3 = Calendar.getInstance();
       lab3.set(2022, Calendar.NOVEMBER, 23, 14, 00, 00);
       long diff3 =  lab3.getTimeInMillis() - today.getTimeInMillis(); 
       long diffSec3 = diff3 / 1000;
       long days3 = diffSec3 / SECONDS_IN_A_DAY;
       long secondsDay3 = diffSec3 % SECONDS_IN_A_DAY;
       long seconds3 = secondsDay3 % 60;
       long minutes3 = (secondsDay3 / 60) % 60;
       long hours3 = (secondsDay3 / 3600);

       Calendar lab4 = Calendar.getInstance();
       lab4.set(2022, Calendar.DECEMBER, 26, 14, 00, 00);
       long diff4 =  lab4.getTimeInMillis() - today.getTimeInMillis(); 
       long diffSec4 = diff4 / 1000;
       long days4 = diffSec4 / SECONDS_IN_A_DAY;
       long secondsDay4 = diffSec4 % SECONDS_IN_A_DAY;
       long seconds4 = secondsDay4 % 60;
       long minutes4 = (secondsDay4 / 60) % 60;
       long hours4 = (secondsDay4 / 3600);

       System.out.println("Today's date: " + today.getTime());
       System.out.printf("Lab 1 due on: " + lab1.getTime() + "\nLab 1 due in %d days, %d hours, %d minutes and %d seconds\n", days1, hours1, minutes1, seconds1);
       System.out.printf("Lab 2 due on: " + lab2.getTime() + "\nLab 2 due in %d days, %d hours, %d minutes and %d seconds\n", days2, hours2, minutes2, seconds2);
       System.out.printf("Lab 3 due on: " + lab3.getTime() + "\nLab 3 due in %d days, %d hours, %d minutes and %d seconds\n", days3, hours3, minutes3, seconds3);
       System.out.printf("Lab 4 due on: " + lab4.getTime() + "\nLab 4 due in %d days, %d hours, %d minutes and %d seconds\n", days4, hours4, minutes4, seconds4);
    }
}
