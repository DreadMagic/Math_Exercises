package com.company;

public class MathEx {
    public static void main(String[] args) {
        System.out.println(swap(1723));
        timeleft(10,21,9,43);
        System.out.println(dayOfWeek(2,20));
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
}
