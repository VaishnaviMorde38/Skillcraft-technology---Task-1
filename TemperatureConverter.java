import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Celsius to Kelvin");
        System.out.println("3: Fahrenheit to Celsius");
        System.out.println("4: Fahrenheit to Kelvin");
        System.out.println("5: Kelvin to Celsius");
        System.out.println("6: Kelvin to Fahrenheit");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();
        
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        double convertedTemperature = 0;
        switch (option) {
            case 1:
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                break;
            case 2:
                convertedTemperature = celsiusToKelvin(temperature);
                System.out.println("Temperature in Kelvin: " + convertedTemperature);
                break;
            case 3:
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println("Temperature in Celsius: " + convertedTemperature);
                break;
            case 4:
                convertedTemperature = fahrenheitToKelvin(temperature);
                System.out.println("Temperature in Kelvin: " + convertedTemperature);
                break;
            case 5:
                convertedTemperature = kelvinToCelsius(temperature);
                System.out.println("Temperature in Celsius: " + convertedTemperature);
                break;
            case 6:
                convertedTemperature = kelvinToFahrenheit(temperature);
                System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                break;
            default:
                System.out.println("Invalid option");
        }
        
        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}