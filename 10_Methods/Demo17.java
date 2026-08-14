// Write a method that takes a temperature in Celsius and returns the equivalent in Fahrenheit.

public class Demo17 {

    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }

    static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}