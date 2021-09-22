package com.company;

public class Random_Numbers {
    public static void main(String[] args) {
        double r = Math.random(); // [0.0-1.0)
        System.out.println(r);
        r = Math.random()*10;
        System.out.println(r); // [0.0-10.0)
        int p = (int)(Math.random()*10); //[0,9]
        System.out.println(p);
        p = (int)(Math.random()*10)+1; // [1,10]
        System.out.println(p);
        int x = (int)(r); // make r integer
        System.out.println(x);
        int y = (int)(r+.5); // make r and integer and round it
        System.out.println(y);
    }
// 123 132
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
