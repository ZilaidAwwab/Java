package com.zilaidawwab.javalang.basics.datatypes;

public class CharDataType {
    public static void main(String[] args) {
        
        char c1, c2;

        c1 = 88; // This will return X (Since 88 is the uni code for capital X in ASCII)
        c2 = 'Y';

        System.out.println("Ch1 and Ch2: " + c1 + " " + c2); // X Y

        // We can also call the increment operator on ASCII code
        c1++; // It is now 89 (Which is capital Y in ASCII)

        System.out.println("Now Ch1 is: " + c1); // Y
    }
}
