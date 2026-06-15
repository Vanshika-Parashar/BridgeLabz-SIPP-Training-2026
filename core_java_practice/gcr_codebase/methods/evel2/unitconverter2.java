package gcr_codebase.methods.evel2;

import java.util.Scanner;

public class unitconverter2 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius = " + convertFahrenheitToCelsius(f));

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + convertCelsiusToFahrenheit(c));

        System.out.print("Enter Pounds: ");
        double p = sc.nextDouble();
        System.out.println("Kilograms = " + convertPoundsToKilograms(p));

        System.out.print("Enter Kilograms: ");
        double kg = sc.nextDouble();
        System.out.println("Pounds = " + convertKilogramsToPounds(kg));

        System.out.print("Enter Gallons: ");
        double g = sc.nextDouble();
        System.out.println("Liters = " + convertGallonsToLiters(g));

        System.out.print("Enter Liters: ");
        double l = sc.nextDouble();
        System.out.println("Gallons = " + convertLitersToGallons(l));
    }
}
