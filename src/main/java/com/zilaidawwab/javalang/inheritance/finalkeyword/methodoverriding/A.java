/*
Method overriding is one of Java’s most powerful feature, there	will be times when you will want
to prevent it from occurring. To disallow a method from being overridden, specify final as a
modifier at the start of its declaration. Methods declared as final cannot be overridden.
*/

package com.zilaidawwab.javalang.inheritance.finalkeyword.methodoverriding;

public class A {
    final void meth() {
        System.out.println("This is a final method, cannot be overridden");
    }
}

/*
Using final keyword with the method gives a performance boost, as Java, then knows that they
won't be overridden in the subclass. Java normally resolves the calls to method dynamically,
called "late binding", but with the use of final it is resolved at compile time executing
"early binding"
*/
