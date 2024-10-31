// Demonstration of a one-dimensional Array

package com.zilaidawwab.javalang.basics.arrays;

public class Array {
    public static void main(String[] args) {
        
        // initializing an array
        int[] monthDays; // int monthDays[]; (Both are valid, first one is Java std)
        
        // allocating memory (At this point all the once are initialized to 0)
        monthDays = new int[12];

        // The above 2 statements can be combined as (this one is the way to go)
        // int[] monthDays = new int[12];

        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;

        System.out.println("April has " + monthDays[3] + " Days.");
        
        // Arrays can be initialized when they are declared
        int[] daysOfMonth = {31, 38, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("April has " + daysOfMonth[3] + " Days.");

        // We can perform operations of these arrays as well
        double result = 0;
        for (int i = 0; i < daysOfMonth.length; i++) {
            result = result + daysOfMonth[i];
        }
        System.out.println("The average number of days in each month are " + result);
    }
}
