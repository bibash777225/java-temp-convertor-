// tempreture converter  build an app that convert tempreture units Celsius to Fahrenheit and vice versal and uses different 
// data
 
import java.util.Scanner;

public class TempretureConvertor {

    public static double celsiusToFhrenheit(double celsius) {
        System.out.println("please enter the temp");
        System.out.println("temp in cel");
        return (celsius * 9 / 5) + 32;
    }

    public static double FahrenheitTOCelcuis(double fahrenheit) {
        System.out.println("temp in fer");
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner Sac = new Scanner(System.in);
        System.out.println("enter the temperature in celsius or fahrenheit:");
        double unit = Sac.nextDouble();

        System.out.println("Celsius to Fahrenheit: " + celsiusToFhrenheit(unit));
        System.out.println("Fahrenheit to Celsius: " + FahrenheitTOCelcuis(unit));

        Sac.close();
    }
}