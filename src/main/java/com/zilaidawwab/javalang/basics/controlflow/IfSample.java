package com.zilaidawwab.javalang.basics.controlflow;

public class IfSample {
    public static void main(String[] args) {
        
        // Two variable declaration of the same type
        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println("X is smaller than Y");

        x = x * 2;
        if (x == y) System.out.println("X is now equal to Y");

        x = x * 2;
        if (x > y) System.out.println("X is now greater than Y");
    }
}
