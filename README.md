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
