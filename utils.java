import java.util.Scanner;

public class utils {
    // Text functions

    // Adds input to the console
    Scanner input = new Scanner(System.in);   
    
    // Prints without a new line
    private static void print(Object text) {
        System.out.print(text);
    }
    // Prints with new line
    private static void println(Object text) {
        System.out.println(text);
    }
    // Gets length of text
    private static int len(String text) {
        return text.length();
    }    

    // Math functions

    // Absolute
    private static double abs(double Input) {
        return Math.abs(Input);
        }
    // Square Root
    private static double sqrt(double Input) {
        return Math.sqrt(Input);
        }

    // Rounding

    // Rounding to the nearest whole number
    private static double round(double Input) {
        return Math.round(Input);
        }

    // Rounding to the lowest whole number
    private static double floor(double Input) {
        return Math.floor(Input);
        }

    // Rounding to the highest whole number
    private static double ceiling(double Input) {
        return Math.ceil(Input);
        }  

    // Trig Functions


    // Sine in Radians
    private static double sin(double Input) {
        return Math.sin(Input);
        }

   // Cosine in Radians
    private static double cos(double Input) {
        return Math.cos(Input);
        }

   // Arc Tangent in Radians
    private static double tan(double Input) {
        return Math.tan(Input);
        } 

    // Arc Sine in Radians
    private static double asin(double Input) {
        return Math.asin(Input);
        }

   // Arc Cosine in Radians
    private static double acos(double Input) {
        return Math.acos(Input);
        }

   // Tangent in Radians
    private static double atan(double Input) {
        return Math.atan(Input);
        } 

   // Atan2 in Radians
    private static double atan2(double Input,double Input2) {
        return Math.atan2(Input,Input2);
        } 


    // Conversions
    
    // Convert to Degrees
    private static double deg(double Input) {
        return Math.toDegrees(Input);
        }      

    // Convert to Degrees
    private static double rad(double Input) {
        return Math.toRadians(Input);
        } 



}
