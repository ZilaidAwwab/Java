# Open-Source Java Repository: From Beginner to Advanced

Welcome to this open-source Java repository, designed to guide developers from the very basics of Java programming all the way to advanced topics. This repository provides a structured collection of Java notes, with code examples covering fundamental concepts to more complex features of the language.

Whether you're new to Java or looking to deepen your knowledge, this resource offers a hands-on learning approach, starting from scratch and progressing to advanced topics like multithreading, collections, JVM internals, and more. The repository is continuously growing, and contributions from the community are encouraged to enhance its scope.

## Compiling and running with only a JDK

### Create a classes folder

```
cd Java
mkdir classes
```

### Compile the algorithm

```
javac -sourcepath src/main/java -d classes src/main/java/ <relative-path-to-java-source-file>
```

### Run the algorithm

```
java -cp classes <class-fully-qualified-name>
```

### Example

```
$ javac -d classes -sourcepath src/main/java src/main/java/com/zilaidawwab/javalang/basics/helloworld/HelloWorld.java
$ java -cp classes com.zilaidawwab.javalang.basics.helloworld.HelloWorld
```

## Basics

### Hello World
The Basic Hello World Program, as a religious practice to start learning any programming language

- [Hello World](src/main/java/com/zilaidawwab/javalang/basics/helloworld/HelloWorld.java)

### Variables
Java is a stronly typed language, so every variable has to be on some primitive or user defined data type

- [Variables](src/main/java/com/zilaidawwab/javalang/basics/variables/Variables.java)

### Primitive Data Types
There are 8 primitive data types in java language. Namely byte, short, int, long, float, double, char, and boolean

- [Long Data Type](src/main/java/com/zilaidawwab/javalang/basics/datatypes/LongDataType.java)
- [Double Data Type](src/main/java/com/zilaidawwab/javalang/basics/datatypes/DoubleDataType.java)
- [Character Data Type](src/main/java/com/zilaidawwab/javalang/basics/datatypes/CharDataType.java)
- [Boolean Data Type](src/main/java/com/zilaidawwab/javalang/basics/datatypes/BooleanDataType.java)

### Control Statements
These include if, for, and while loops, switch statements which control the flow of program

- [If Statements](src/main/java/com/zilaidawwab/javalang/basics/controlflow/IfSample.java)
- [For Loops](src/main/java/com/zilaidawwab/javalang/basics/controlflow/ForSample.java)

### Additional Concepts
These are some concepts that are internal java specifics 

- [Dynamic Initialization](src/main/java/com/zilaidawwab/javalang/basics/additionalconcepts/DynamicInitialization.java)
- [Variable Scope](src/main/java/com/zilaidawwab/javalang/basics/additionalconcepts/VariableScope.java)
- [Type Conversion](src/main/java/com/zilaidawwab/javalang/basics/additionalconcepts/TypeConversion.java)
- [Type Promotions](src/main/java/com/zilaidawwab/javalang/basics/additionalconcepts/TypePromotion.java)
- [Type Inference](src/main/java/com/zilaidawwab/javalang/basics/additionalconcepts/TypeInference.java)

### Arrays
Here all about arrays in Java is demonstrated, from one to multidimensional arrays 

- [Array](src/main/java/com/zilaidawwab/javalang/basics/arrays/Array.java)
- [Two Dimensional Array](src/main/java/com/zilaidawwab/javalang/basics/arrays/TwoDArray.java)
- [Two Dimensional Array (Extended)](src/main/java/com/zilaidawwab/javalang/basics/arrays/TwoDAgain.java)
- [Matrix](src/main/java/com/zilaidawwab/javalang/basics/arrays/Matrix.java)
- [Three Dimensional Array](src/main/java/com/zilaidawwab/javalang/basics/arrays/ThreeDArray.java)

### Operators
This covers all the operators available in Java, including Arithmetic, Bitwise, Relational and Logical Operators

#### Arithmetic Operators
- [Basic Math](src/main/java/com/zilaidawwab/javalang/basics/operators/arithmetic/BasicMath.java)
- [Modulus](src/main/java/com/zilaidawwab/javalang/basics/operators/arithmetic/Modulus.java)
- [Compound Assignment Operator](src/main/java/com/zilaidawwab/javalang/basics/operators/arithmetic/OpEquals.java)
- [Increment Decrement Operator](src/main/java/com/zilaidawwab/javalang/basics/operators/arithmetic/IncDec.java)

#### Bitwise Operators
- [Bitwise Logical Operator](src/main/java/com/zilaidawwab/javalang/basics/operators/bitwise/BitLogic.java)
- [Left Shift](src/main/java/com/zilaidawwab/javalang/basics/operators/bitwise/LeftShift.java)
- [Multiply By 2 (Left Shift)](src/main/java/com/zilaidawwab/javalang/basics/operators/bitwise/MultByTwo.java)
- [Right Shift](src/main/java/com/zilaidawwab/javalang/basics/operators/bitwise/RightShift.java)
- [HexByte (Masking Sign Extension)](src/main/java/com/zilaidawwab/javalang/basics/operators/bitwise/HexByte.java)
- [Unsigned Shift (Right Shift Extension)](src/main/java/com/zilaidawwab/javalang/basics/operators/bitwise/ByteUnShift.java)
- [Compound Assigment (In Bitwise Operators)](src/main/java/com/zilaidawwab/javalang/basics/operators/bitwise/OpBitEquals.java)

#### Relational Operator
- [Relational Operator](src/main/java/com/zilaidawwab/javalang/basics/operators/relational/RelationalOps.java)

#### Boolean Logical Operator
- [Boolean Logical Operator](src/main/java/com/zilaidawwab/javalang/basics/operators/booleanlogical/BooleanLogicalOps.java)

#### Short Circuit Operator
- [Short Circuit Operator](src/main/java/com/zilaidawwab/javalang/basics/operators/ShortCircuit/ShortCircuitLogicalOperator.java)

#### Ternary Operator
- [Ternary Operator](src/main/java/com/zilaidawwab/javalang/basics/operators/Ternary/TernaryOperator.java)

### Control Statements
Here all types of Control Statement available in Java are covered, including if-else, if-else-if else, nested ifs, switch statements.

#### If-Else Statements
- [If-Else Statements](src/main/java/com/zilaidawwab/javalang/basics/controlstatements/IfElseStatement.java)

#### Switch Statements
- [Switch Statements](src/main/java/com/zilaidawwab/javalang/basics/controlstatements/SwitchStatement.java)

### Iteration Statements
Java’s iteration statements are for, for-each, while, and do-while. These statements create what we commonly call loops. A loop repeatedly executes the same set of instructions until a termination condition is met.

#### While
- [While Loop](src/main/java/com/zilaidawwab/javalang/basics/iterationstatements/WhileLoop.java)
 
#### Do-While
- [Do-While Loop](src/main/java/com/zilaidawwab/javalang/basics/iterationstatements/DoWhileLoop.java)
- [Do-While Loop Example](src/main/java/com/zilaidawwab/javalang/basics/iterationstatements/Menu.java)

#### For
- [For Loop](src/main/java/com/zilaidawwab/javalang/basics/iterationstatements/ForLoop.java)

#### For-Each
- [For Each Loop](src/main/java/com/zilaidawwab/javalang/basics/iterationstatements/ForEachLoop.java)
- [For Each Loop (For Multi-dimensional Arrays)](src/main/java/com/zilaidawwab/javalang/basics/iterationstatements/ForEachLoopMultiDim.java)
- [Type Inference in For](src/main/java/com/zilaidawwab/javalang/basics/iterationstatements/TypeInferenceinFor.java)

### Jump Statements
Java supports three jump statements: break, continue, and return. These statements transfer control to another part of your program.

#### Break
- [Break Statement](src/main/java/com/zilaidawwab/javalang/basics/jumpstatements/Break.java)

#### Continue
- [Continue Statement](src/main/java/com/zilaidawwab/javalang/basics/jumpstatements/Continue.java)

#### Return
- [Return Statement](src/main/java/com/zilaidawwab/javalang/basics/jumpstatements/Return.java)

## Classes

### Class Fundamentals
A Class is at the core of Java, it defines the shape and nature of an object. A class is a template for an object and object is an instance of a class.

#### Simple Class
Here instance variable, methods (empty and parameterized), constructors (empty and parameterized), and "this" keyword are covered.
- [Class Creation](src/main/java/com/zilaidawwab/javalang/classes/fundamentals/Box.java)
- [Class Utilization](src/main/java/com/zilaidawwab/javalang/classes/fundamentals/BoxDemo.java)
- [Object Reference](src/main/java/com/zilaidawwab/javalang/classes/fundamentals/ObjectReference.java)

#### Class Example
- [Stack Class](src/main/java/com/zilaidawwab/javalang/classes/example/Stack.java)
- [Stack Class Utilization](src/main/java/com/zilaidawwab/javalang/classes/example/StackUsage.java)

#### Method Overloading
- [Method Overloaded Class](src/main/java/com/zilaidawwab/javalang/classes/methodoverload/MethodOverload.java)
- [Method Overloaded Utilization](src/main/java/com/zilaidawwab/javalang/classes/methodoverload/MethodOverloadUtil.java)

#### Constructor Overloading
- [Constructor Overloaded Class](src/main/java/com/zilaidawwab/javalang/classes/constructoroverload/BoxConstructorOverload.java)
- [Constructor Overloaded Utilization](src/main/java/com/zilaidawwab/javalang/classes/constructoroverload/BoxConstructorOverloadUtil.java)

#### Objects as Parameters
- [Object Param](src/main/java/com/zilaidawwab/javalang/classes/objectsasparams/Test.java)
- [Object Param Utilization](src/main/java/com/zilaidawwab/javalang/classes/objectsasparams/PassOb.java)

#### Argument Passing

##### Pass by Value
- [Sample Class](src/main/java/com/zilaidawwab/javalang/classes/passbyvalue/Test.java)
- [Call By Value Class](src/main/java/com/zilaidawwab/javalang/classes/passbyvalue/CallByValue.java)

##### Pass by Reference
- [Sample Class](src/main/java/com/zilaidawwab/javalang/classes/passbyreference/Test.java)
- [Call by Reference Class](src/main/java/com/zilaidawwab/javalang/classes/passbyreference/CallByReference.java)

#### Returning Object
- [Sample Class](src/main/java/com/zilaidawwab/javalang/classes/returningobjects/Test.java)
- [Object Return Demonstration Class](src/main/java/com/zilaidawwab/javalang/classes/returningobjects/ReturnObj.java)

#### Recursion
- [Sample Class](src/main/java/com/zilaidawwab/javalang/classes/recursion/Factorial.java)
- [Class Utilizing Recursion](src/main/java/com/zilaidawwab/javalang/classes/recursion/Recursion.java)
- [Recursion Example](src/main/java/com/zilaidawwab/javalang/classes/recursion/RecursionEx.java)

#### Access Modifiers
- [Public and Private Modifiers](src/main/java/com/zilaidawwab/javalang/classes/accessmodifiers/Test.java)
- [Testing public and private](src/main/java/com/zilaidawwab/javalang/classes/accessmodifiers/AccessTest.java)

#### Static Keyword
- [Static Variables, Methods and Blocks](src/main/java/com/zilaidawwab/javalang/classes/statickeyword/UseStatic.java)
- [Using Static Methods and Vars outside the Class](src/main/java/com/zilaidawwab/javalang/classes/statickeyword/UseStaticOutside.java)

#### Final Keyword
- [Final Keyword](src/main/java/com/zilaidawwab/javalang/classes/finalkeyword/UseFinal.java)

#### Nested and Inner Classes
- [Nested Inner Class](src/main/java/com/zilaidawwab/javalang/classes/nestedclasses/Outer.java)
- [Inner Class Usages](src/main/java/com/zilaidawwab/javalang/classes/nestedclasses/InnerUse.java)

#### Varargs (Variable Number of Arguments)
- [Varargs (Old Approach)](src/main/java/com/zilaidawwab/javalang/classes/variableargs/Varargs.java)
- [Varargs (New Approach)](src/main/java/com/zilaidawwab/javalang/classes/variableargs/VarargsNew.java)
- [Varargs Method Overloading](src/main/java/com/zilaidawwab/javalang/classes/variableargs/VarargsOverload.java)
