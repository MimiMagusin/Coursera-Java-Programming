# Coursera-Java-Programming
> In this repository, you can find the exercises of this execellent [Coursera course of Duke University](https://www.coursera.org/learn/java-programming), and the notes of several things I learnt about Java.

## Week 1: Fundamental Java Syntax and Semantics
### Compiling
* Java (_human readable_) **source code** needs to be **compiled** to (_machine readable_) **low level bite code**.
* To write source code, we will use the environment [BlueJ](https://www.bluej.org/).
* Code is written in **classes**, each class is saved as a _.java_ file and compiled to a _.class_ file.
* To run a method in in BlueJ, compile your class, create a new instance of it (**object**) and call the method you need.

### Shape and Point
* We will use a **Java Class** named _Shape_ (or _Polygon_) to represent a a collection of points.
    * Possible actions: construct a polygon/shape, access points of it, implement operations/methods (like drawing).
    * It can only represent a finite number of points.
* An initial default value of _0_ is given to **instance variables**, and there is an option to instantiate a default value yourself.
* You **declare** a variable and **initialize** it:
```Java
int x ; //declaration
x = 4 + 3 ; // initialize

int y = x * 3 ; // declare and initialize y in one line
```

## Functions and Conditionals
* Java has **methods** rather than **functions** because all code lives in objects.
* The **main method** is where the program starts (if you run it outside of BlueJ).
* You declare a function as follows:
```Java
int myFunction(int x, int y) {    //create frame and pass params
  int z = 2 * x - y;
  return z * x;                   // return statement
}
```
* And you can call functions inside other functions:
```Java
int f(int n){
  return 3 + myFunction(n, n+1);
}

int g() {
  int a;
  a = myFunction(3, 7);
  int b = f(a * a);
  return b;
}
```
* **Conditionals** are create in the following way:
```Java
int f (int x, int y) {
  if (x < y ) {
    System.out.println("x < y");
    return y + x;
  } else {
    System.out.println("x >= y");
    if (x > 8 ) {
      return y + 7;
    }
  }
  return x - 2;
}
```

## Classes Types and For Each Loops
## Seven Steps for Solving Programming Problems
