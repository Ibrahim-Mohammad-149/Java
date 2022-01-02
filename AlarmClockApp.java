package JavaApps;

import java.time.*;
import java.time.temporal.ChronoField;

public class AlarmClockApp{
    public static void main(String[] args) {
        LocalDateTime now =  LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);
        int amPm = now.get(ChronoField.AMPM_OF_DAY);

        //Greeting
        if(hour<12){
            System.out.println("Good Morning!");
        }
        else if(hour<17){
            System.out.println("Good Afternoon!");
        }
        else{
            System.out.println("Good Evening");
        }

        String monthOut = "";

        //Month
        switch(month){
            case 1:
            monthOut = "January";
            break;
            
            case 2:
            monthOut = "February";
            break;

            case 3:
            monthOut = "March";
            break;

            case 4:
            monthOut = "April";
            break;

            case 5:
            monthOut = "May";
            break;

            case 6:
            monthOut = "June";
            break;

            case 7:
            monthOut = "July";
            break;

            case 8:
            monthOut = "August";
            break;

            case 9:
            monthOut = "September";
            break;

            case 10:
            monthOut = "October";
            break;

            case 11:
            monthOut = "November";
            break;

            case 12:
            monthOut = "December";
            break;
        }

        //Am Pm
        String amPmOut="";
        switch(amPm){
            case 1:
            amPmOut = "pm";
            break;

            case 2:
            amPmOut = "am";
            break;
        }

        //Time
        System.out.printf("Today is %d %s %d (%d/%d/%d)",day,monthOut,year,day,month,year);
        System.out.printf("%nIt's currently %d:%d %s",hour,minute,amPmOut);

        
    }
}