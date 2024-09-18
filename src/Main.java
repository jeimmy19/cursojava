//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        public static void main(String[] args) {
            double temperaturaEnCelsius = 30.4;
            double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

            String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

            System.out.println(mensaje);

            int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
            System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);

        }

    }