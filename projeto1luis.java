import java.util.Scanner;

public class ConversorTemperatura {

    // Converte Kelvin para Celsius
    public static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Converte Kelvin para Fahrenheit
    public static double kelvinParaFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Kelvin (>= 0): ");
        double temperaturaKelvin = scanner.nextDouble();

        if (temperaturaKelvin < 0) {
            System.out.println("Temperatura em Kelvin não pode ser negativa.");
        } else {
            double temperaturaCelsius = kelvinParaCelsius(temperaturaKelvin);
            double temperaturaFahrenheit = kelvinParaFahrenheit(temperaturaKelvin);

            System.out.printf("%.2f K equivale a %.2f °C e %.2f °F%n",
                              temperaturaKelvin, temperaturaCelsius, temperaturaFahrenheit);
        }

        scanner.close();
    }
}

