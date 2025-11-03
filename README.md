
#  Java Utility Library (JUL)

The Java Utility Library is a simple library that works without any other preinstallations required. The Library as of now contains basic functions to make writing easier, with syntax similar to Python & JavaScript.
## How to use the utilities
When you create a new class in another file, you should extend the class with the library name as seen below.
```java
public class Main extends utils {
    public static void main(String[] args) {
        println("Hello World!");

    }
}
```
This allows you to directly call methods from the library without having to calling the library beforehand.

## How to use custom data types
Theres some custom data types I have added including vector3 which you can use through objects.
```java
public class main {
    public static void main(String[] args) {
        vector3 data = new vector3(3,5,8);
        System.out.println(data.x());
    }
}
```
# Library Refrences
Library refrences for using all of the utility library without having to look at the source code.
## utils refrence

| Function | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `print()` | `any` | Prints any without a new line 
| `println()` | `any` | Prints any with a new line |
| `len(a)` | `string` | Gets the string length |
| `abs(a)` | `double` | returns the absolute of the double  |
| `sqrt(a)` | `double` | returns the square root of the double |
| `round(a)` | `double` | returns the round of the double |
| `floor(a)` | `double` |returns the floor of the double  |
| `ceiling(a)` | `double` | returns the ceiling of the double |
| `sin(a)` | `double` | returns the sine of a double (in radians) |
| `cos(a)` | `double` | returns the cosine of a double (in radians) |
| `tan(a)` | `double` | returns the tangent of a double (in radians) |
| `asin(a)` | `double` | returns the arcsine of a double (in radians) |
| `acos(a)` | `double` | returns the arccosine of a double (in radians) |
| `atan(a)` | `double` | returns the arctangent of a double (in radians) |
| `atan2(a,b)` | `double` | returns the atan2 of a double (in radians) |
| `deg(a)` | `double` | returns radians to degrees |
| `rad(a)` | `double` | returns degrees to rad |

## vector3 refrence
| Function | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `vector3.x()` | `double` | returns the first number in the vector3 | 
| `vector3.y()` | `double` | returns the second number in the vector3 | 
| `vector3.z()` | `double` | returns the third number in the vector3 | 

# Credits
Made by MeowSeal - https://github.com/meowseal    
Java Documentation - https://docs.oracle.com/javase/7/docs  

 

## Contributers
This section is for people who contribute to this repository and helped with the creation of the library.
<p align="center">
  <img src="https://contrib.rocks/image?repo=meowseal/Java-Utility-Library-JUL-" alt="Contributors" />
</p>
