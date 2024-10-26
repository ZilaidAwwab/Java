package com.zilaidawwab.javalang.basics.datatypes;

public class BooleanDataType {
    public static void main(String[] args) {
        
        boolean b;
        b = false;
        System.out.println("b is: " + b);

        b = true;
        System.out.println("b is: " + b);

        // Boolean values are used to control the flow on control statements
        if (b) System.out.println("This is executed, because B is true here");
        // There's no need to write it like if (b == true)

        b = false;
        if (b) System.out.println("This is not executed, because B is false here");

        // Outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9)); // True
        // Here adding paranthesis around (10 > 9) was important because "+" operator has higher precedence and that would have concatenated 10 with string
    }
}
