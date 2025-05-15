package com.zilaidawwab.javalang.classes.objectsasparams;

public class PassOb {
    public static void main(String[] args) {

        Test obj1 = new Test(100, 232);
        Test obj2 = new Test(-1, 232);
        Test obj3 = new Test(100, 232);

        System.out.println("Obj1 == Obj2: " + obj1.equalTo(obj2)); // false
        System.out.println("Obj1 == Obj3: " + obj1.equalTo(obj3)); // true
    }
}
