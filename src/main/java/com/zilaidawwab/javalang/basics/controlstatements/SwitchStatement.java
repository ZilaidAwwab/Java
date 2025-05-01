/**
 * Simple example of Switch and Nested Switch Statements in Java
 */

package com.zilaidawwab.javalang.basics.controlstatements;

public class SwitchStatement {
    public static void main(String[] args) {

        // Before JDK 7, we could only use byte, short, int, char or an enumeration as expression
        // But after JDK 7, we can use String type as well

        // The value of the expression(i here) is compared with each of the values in the case statements.
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                default:
                    System.out.println("i is greater than 3");
            }
        }

        // In a switch, break statements are optional (and sometimes we don't want break after every switch statement)
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10");
                    break;
                default:
                    System.out.println("i is 10 or more");
            }
        }

        int month = 4;
        String season;

        // Re-writing the previous example of if else in switch
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Bogus Season";
        }
        System.out.println("April is in the " + season + ".");


        /**
         * This above switch case can be written in short as;
         * String season = switch (month) {
         *             case 12, 1, 2 -> "Winter";
         *             case 3, 4, 5 -> "Spring";
         *             case 6, 7, 8 -> "Summer";
         *             case 9, 10, 11 -> "Autumn";
         *             default -> "Bogus Season";
         *         };
         */

        int count = 1;
        int target = 0;

        // Nested Switch
        switch (count) {
            case 1:
                switch (target) {
                    case 0:
                        System.out.println("Target is zero");
                        break;
                    case 1: // no conflicts with the outer switch
                        System.out.println("Target is one");
                        break;
                }
                break;
            // case 2: so on...
        }
    }
}

/**
 * 1. The switch differs from the if in that switch can only test for equality,
 * whereas if can evaluate any type of Boolean expression. That is, the
 * switch looks only for a match between the value of the expression and one
 * of its case constants.
 *
 * 2. No two case constants in the same switch can have identical values. Of
 * course, a switch statement and an enclosing outer switch can have case
 * constants in common.
 *
 * 3. A switch statement is usually more efficient than a set of nested ifs.
 */
