/*
 * Edward Lee
 * CISC 3140
 * Lab2
 */

 import java.time.LocalDate;
 import java.time.temporal.ChronoUnit;
 import java.time.Month;
 import java.util.GregorianCalendar;

import javax.lang.model.util.ElementScanner14;

import java.util.*;

public class DatesDiff{
    // Store Labs, quizzes, and final dates
    static LocalDate lab1 = LocalDate.of(2022, 9, 27);
    static LocalDate lab2 = LocalDate.of(2022, 10, 26);
    static LocalDate lab3 = LocalDate.of(2022, 11, 23);
    static LocalDate lab4 = LocalDate.of(2022, 12, 7);

    static LocalDate quiz1 = LocalDate.of(2022, 9, 27);
    static LocalDate quiz2 = LocalDate.of(2022, 9, 28);
    static LocalDate quiz3 = LocalDate.of(2022, 10, 26);
    static LocalDate quiz4 = LocalDate.of(2022, 11, 11);
    static LocalDate quiz5 = LocalDate.of(2022, 12, 7);

    static LocalDate finalExam = LocalDate.of(2022, 12, 19);

    public static void main(String[] args){
        // initialize the variables
        int y1, y2, m1, m2, d1, d2 = 0;
        int num = 0;
        
        // initialize the user input scanner
        Scanner userIn = new Scanner(System.in);

        // do-while loop to read user input until no input
        do{
        
        System.out.println("Days Counter: \n(1) View all due dates\n(2) Calculate days differences");
        num = userIn.nextInt();
        if (num == 1)
        {
            // print all saved due dates
            dueDates();
        }
        else if (num == 2)
        {
            // get first date from the user input
            System.out.println("Enter first date (MM/DD/YYY): ");
            m1 = userIn.nextInt();
            d1 = userIn.nextInt();
            y1 = userIn.nextInt();

            //get second date from the user input
            System.out.println("Enter second date (MM/DD/YYY): ");
            m2 = userIn.nextInt();
            d2 = userIn.nextInt();
            y2 = userIn.nextInt();

            // Unify year, day, and month in one variable
            int day1 = (y1 * 365 + m1 * 30) + d1;
            int day2 = (y2 * 365 + m2 * 30) + d2;
            // call dayDiff function
            dayDiff(day1, day2);
        }
        else{
            // Reminder if the user enter different int/char other than 1 or 2
            System.out.println("Please enter '1' or '2'.");
        }
        }while(num > 0);
        // Scanner close from prevent data leaks
        userIn.close();
    }

    public static void dueDates(){
        // Get local time
        LocalDate currDate = LocalDate.now();
        // Calculate days difference from stored due dates
        System.out.println(currDate.until(lab1, ChronoUnit.DAYS) + "day(s) left until Lab1");
        System.out.println(currDate.until(lab2, ChronoUnit.DAYS) + "day(s) left until Lab2");
        System.out.println(currDate.until(lab3, ChronoUnit.DAYS) + "day(s) left until Lab3");
        System.out.println(currDate.until(lab4, ChronoUnit.DAYS) + "day(s) left until Lab4\n");
        System.out.println(currDate.until(quiz1, ChronoUnit.DAYS) + "day(s) left until quiz1");
        System.out.println(currDate.until(quiz2, ChronoUnit.DAYS) + "day(s) left until quiz2");
        System.out.println(currDate.until(quiz3, ChronoUnit.DAYS) + "day(s) left until quiz3");
        System.out.println(currDate.until(quiz4, ChronoUnit.DAYS) + "day(s) left until quiz4");
        System.out.println(currDate.until(quiz5, ChronoUnit.DAYS) + "day(s) left until quiz5\n");
        System.out.println(currDate.until(finalExam, ChronoUnit.DAYS) + "day(s) left until final\n");
    }
    public static void dayDiff(int date1, int date2){
        // Date subtraction and print
        int daysDiff = date2 - date1;
        System.out.println(daysDiff + "day(s) left\n");
    }

}
