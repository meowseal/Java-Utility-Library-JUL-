
#  Java Utility Library (JUL)

The Java Utility Library is a simple library that works without any other preinstallations required. The Library as of now contains basic functions to make writing easier, with syntax similar to Python & JavaScript.
## How to use
When you create a new class in another file, you should extend the class with the library name as seen below.
```java
public class Main extends utils {
    public static void main(String[] args) {
        println("Hello World!");

    }
}
```
This allows you to directly call methods from the library without having to calling the library beforehand.

## Library Refrence


| Function | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `print()` | `any` | Prints a string without a new line 
| `println()` | `any` | Prints a string like a new line |
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
| `atan2(a)` | `double` | returns the atan2 of a double (in radians) |
| `deg(a)` | `double` | returns radians to degrees |
| `rad(a)` | `double` | returns degrees to rad |

