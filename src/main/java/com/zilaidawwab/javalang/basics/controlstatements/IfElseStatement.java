/**
 * Demonstration of Simple If-Else and If-Else-if and Else Statements in Java
 */

package com.zilaidawwab.javalang.basics.controlstatements;

public class IfElseStatement {
    public static void main(String[] args) {

        // If-Else
        int a = 5;
        int b = 9;
        int c = 12;
        int d = 15;
        int i = 10;
        int j = 18;
        int k = 65;

        if (i == 10) {
            if (j < 20) a = b;
            if (k > 100) c = d; // this if is
            else a = c;         // associated with this else
        }
        else a = d; // this else refers to if (i == 10)
        // The final else is not associated with if(j<20) because it is not in the same block

        // If-Else-if Else
        int month = 4;
        String season;

        if (month == 12 || month == 1 || month == 2) season = "winter";
        else if (month == 3 || month == 4 || month == 5) season = "spring";
        else if (month == 6 || month == 7 || month == 8) season = "summer";
        else if (month == 9 || month == 10 || month == 11) season = "autumn";
        else season = "Bogus Month";

        System.out.println("April is in the " + season + ".");
    }
}
