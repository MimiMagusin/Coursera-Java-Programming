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
* Data stored in variables, and  code to manipulate it. **Object Oriented Programming** is a code paradigm of programming languages that groups the two into logical units called objects.
* A **class** is a template that specifies how to make objects. This is how you declare it:
```Java

public class Point {                            // Declaration of the Class named Point
   private int x;                               // Declaration of two fields: x and y
   private int y;                               // 'Private': only code inside of this class can directly manipulate these fields
   
   public Point(int startx, instarty) {         // Declaration of a Constructor: 
      x = startx;                               // Tells how to create objects of this class
      y = starty;                               // Looks like a function with the samen name as the class, without return type
   }                                            // 'Public': Any code can access it
   
   public int getX() { return x; }              // Declaration of a method
   public int getY() { return y; )              // Methods is a function in class
   public double distance(Point otherPt) {      // They are called on a particular object and implicitly act on that object
      int dx = x - OtherPt.getX();              // 'OtherPt.getX()': method call
      int dy = y - otherPt.getY();
      return Math.sqrt(dx * dx + dy * dy);
   }
   
   public static void main(String[] args) {     // Declaratio nof a static method, main
      Point p1 = new Point(3,4);                 // Execution starts in main, before objects are even created.
      Point p2 = new Point(6,8);                // 'new': create data in the heap
      System.out.println(pl.distance(p2);
   }
}

```
* If you create data in the **heap** does not go away when a function returns destroing its frame

## Seven Steps for Solving Programming Problems
