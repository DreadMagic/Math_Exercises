package com.company;

public class MathEx {
    public static void main(String[] args) {

            int input = 123;
            int output = swap(input);
            System.out.println(input +" " + output);

            input = 6;
            output = swap(input);
            System.out.println(input +" " + output);

            input = 381;
            output = swap(input);
            System.out.println(input +" " + output);

            timeleft(1,34, 8, 20);
            timeleft(1,15, 4, 36);

            System.out.println(dayOfWeek(0,1));
            System.out.println(dayOfWeek(0,14));
            System.out.println(dayOfWeek(6, 22));
            System.out.println(dayOfWeek(5, 4));
            System.out.println(dayOfWeek(1,24));
            System.out.println(dayOfWeek(2,1));
    }

    public static int swap(int x) {
        int ones = x%10;
        int tens = x%100/10;
        int hunds= x/100;
        x = hunds*100 + ones*10 + tens;
        return x;
    }

    public static void timeleft(int chour, int cmin, int dhour, int dmin) {

        int time1 = chour*60+cmin;
        int time2 = dhour*60+dmin;
        int diftime = time2 - time1;
        if(diftime<0){
            System.out.println("You missed your train!");
        }
        if(diftime>0) {
            int difhour = diftime / 60;
            int difmin = diftime % 60;
            System.out.println("Your train leaves in " + difhour + " hours and " + difmin + " minutes.");
        }
    }

    public static int dayOfWeek(int jan1, int date) {
        int day = (jan1+date-1)%7;
        return day;
    }
    //123 132
    //6 60
    //381 318
    //Your train leaves in 6 hours and 46 minutes.
    //Your train leaves in 3 hours and 21 minutes.
    //0
    //6
    //6
    //1
    //3
    //2
    //
    //Process finished with exit code 0
}
