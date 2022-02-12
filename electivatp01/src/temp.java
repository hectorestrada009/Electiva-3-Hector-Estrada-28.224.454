//Libreria para el uso de la función Scanner
import java.util.Scanner;

public class temp {

     public static void view(){
     float celsius;

        //Petición de datos

        Scanner gr = new Scanner(System.in);
        System.out.println("Ingresa los grados celsius: ");
        celsius = gr.nextFloat();

        float fahrenheit = celsiusAFahrenheit(celsius);
        System.out.printf("%f grados celsius son %f grados fahrenheit", celsius, fahrenheit);
     }
     
     //Convertidores

    public static float celsiusAFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }

    public static float fahrenheitACelsius(float fahrenheit) {
        return (fahrenheit - 32) / 1.8f;
    }
}
