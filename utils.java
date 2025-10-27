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
    // Rounding to the nearest whole number
    private static double round(double Input) {
        return Math.round(Input);
        }


}
