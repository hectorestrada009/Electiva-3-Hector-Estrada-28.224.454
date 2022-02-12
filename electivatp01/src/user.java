//Libreria para el uso de la función Scanner
import java.util.Scanner;

public class user {
     public static void main(){

        Scanner lec = new Scanner(System.in);
        //Toma de datos
        String nombre = lec.nextLine();
        String apellido = lec.nextLine();
        String correo = lec.nextLine();
        String direccion = lec.nextLine();
        long numero_telefono = lec.nextLong();

        System.out.println("su nombre es:" + nombre);
        System.out.println("su apellido es:" + apellido);
        System.out.println("su correo es:" + correo);
        System.out.println("su direccion es:" + direccion);
        System.out.println("su numero telefonico es:" + numero_telefono);
    }
}
