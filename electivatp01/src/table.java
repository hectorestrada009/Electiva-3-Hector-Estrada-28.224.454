//Libreria para el uso de la función Scanner
import java.util.Scanner;

public class table {

    public static void view(){
        //Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("Introduce un número entero: ");
        a = sc.nextInt();

        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){

            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
