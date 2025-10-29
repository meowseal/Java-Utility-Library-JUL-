// Import Scanner for input
import java.util.Scanner;

// File Class
public class utils {
    // Text functions

    // Adds input to the console
    Scanner input = new Scanner(System.in);   
    
    // Prints without a new line
    public static void print(Object text) {
        System.out.print(text);
    }
    // Prints with new line
    public static void println(Object text) {
        System.out.println(text);
    }
    // Gets length of text
    public static int len(String text) {
        return text.length();
    }    

    // Math functions

    // Absolute
    public static double abs(double Input) {
        return Math.abs(Input);
        }
    // Square Root
    public static double sqrt(double Input) {
        return Math.sqrt(Input);
        }

    // Rounding

    // Rounding to the nearest whole number
    public static double round(double Input) {
        return Math.round(Input);
        }

    // Rounding to the lowest whole number
    public static double floor(double Input) {
        return Math.floor(Input);
        }

    // Rounding to the highest whole number
    public static double ceiling(double Input) {
        return Math.ceil(Input);
        }  

    // Trig Functions


    // Sine in Radians
    public static double sin(double Input) {
        return Math.sin(Input);
        }

   // Cosine in Radians
    public static double cos(double Input) {
        return Math.cos(Input);
        }

   // Arc Tangent in Radians
    public static double tan(double Input) {
        return Math.tan(Input);
        } 

    // Arc Sine in Radians
    public static double asin(double Input) {
        return Math.asin(Input);
        }

   // Arc Cosine in Radians
    public static double acos(double Input) {
        return Math.acos(Input);
        }

   // Tangent in Radians
    public static double atan(double Input) {
        return Math.atan(Input);
        } 

   // Atan2 in Radians
    public static double atan2(double Input,double Input2) {
        return Math.atan2(Input,Input2);
        } 


    // Conversions
    
    // Convert to Degrees
    public static double deg(double Input) {
        return Math.toDegrees(Input);
        }      

    // Convert to Degrees
    public static double rad(double Input) {
        return Math.toRadians(Input);
        } 

    }
}
