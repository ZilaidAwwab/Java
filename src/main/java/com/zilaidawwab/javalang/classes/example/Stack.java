/**
 * A simple "Stack" example to demonstrate the use of Encapsulation and Abstraction in Classes
 */

package com.zilaidawwab.javalang.classes.example;

public class Stack {

    int[] stack = new int[10];
    int tos;

    // Initialize top of stack (Constructor)
    Stack() {
        tos = -1;
    }

    // Push an item to the stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        }
        else {
            stack[++tos] = item;
        }
    }

    // Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}

/**
 * In this class, we have 2 main method push and pop, the way we are using encapsulation is that
 * the user don't know how the data inside it is maintained and manipulated. And the abstraction
 * part is that we are using Array to handle it, where we can use Linked List as well. So, again
 * the user is unaware of the underlying implementation part that the class is using
 */
