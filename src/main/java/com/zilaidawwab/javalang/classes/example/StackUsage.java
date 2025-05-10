/**
 * Example of utilization of Classes as Objects and calling methods on those objects
 */

package com.zilaidawwab.javalang.classes.example;

public class StackUsage {
    public static void main(String[] args) {

        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // Push some numbers onto the stack
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int j = 10; j < 20; j++) myStack2.push(j);

        // Pop the numbers off the stack
        System.out.println("Elements in First Stack:");
        for (int i = 0; i < 10; i++) System.out.println(myStack1.pop());

        System.out.println();
        System.out.println("Elements in Second Stack:");
        for (int i = 0; i < 10; i++) System.out.println(myStack2.pop());
    }
}
