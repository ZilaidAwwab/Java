/**
 * Compute distance light travels using long variables 
 */

package com.zilaidawwab.javalang.basics.datatypes;

public class LongDataType {
    public static void main(String[] args) {
        
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightspeed = 18600;

        // specify number of days
        days = 1000;

        // convert to seconds
        seconds = days * 24 * 60 * 60;

        // compute distance
        distance = lightspeed * seconds;

        System.out.println("In" + days + " days, light will travel about " + distance + " miles.");
    }
}
