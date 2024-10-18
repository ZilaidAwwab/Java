# Open-Source Java Repository: From Beginner to Advanced

Welcome to this open-source Java repository, designed to guide developers from the very basics of Java programming all the way to advanced topics. This repository provides a structured collection of Java notes, with code examples covering fundamental concepts to more complex features of the language.

Whether you're new to Java or looking to deepen your knowledge, this resource offers a hands-on learning approach, starting from scratch and progressing to advanced topics like multithreading, collections, JVM internals, and more. The repository is continuously growing, and contributions from the community are encouraged to enhance its scope.

## Compiling and running with only a JDK

### Create a classes folder

```
cd Algorithms
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
$ javac -d classes -sourcepath src\main\java src\main\java\com\zilaidawwab\javalang\Main.java
$ java -cp classes com.zilaidawwab.javalang.Main
```
