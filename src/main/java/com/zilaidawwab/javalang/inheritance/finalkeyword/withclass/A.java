/*
If we want to prevent a class from being inherited. We precede the class declaration with final.
Declaring a class as final implicitly declares all of its methods as final, too.
It is illegal to declare a class as	both abstract and final since an abstract class is incomplete
by itself and relies upon its subclasses to provide complete implementations.
 */
package com.zilaidawwab.javalang.inheritance.finalkeyword.withclass;

// Now this class cannot be inherited and all of its methods are final too.
final class A {
}
