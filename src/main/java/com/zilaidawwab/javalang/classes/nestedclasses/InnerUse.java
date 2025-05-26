/**
 * Class demonstrating that inner class can be placed anywhere inside the outer class
 */

package com.zilaidawwab.javalang.classes.nestedclasses;

public class InnerUse {
    int i = 100;

    void test() {
        for (int k = 0; k < 10; k++) {
            // An inner class can be created even inside a loop
            class Inner {
                void display() {
                    System.out.println("Display: outer class var = " + i);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }

    public static void main(String[] args) {
        InnerUse in = new InnerUse();
        in.test();
    }
}
