import java.util.Scanner;

public class edad {
    public class edad {

        public static void main(String[] args) {
            //Variables
            Scanner entrada = new Scanner (System.in);
            int fecha_actual;
            int fecha_nacimiento;
            int edad;
            
            System.out.print("Introduzca el año actual");
            fecha_actual = entrada.nextInt();
            
            System.out.print("Introduzca su año de nacimiento");
            fecha_nacimiento = entrada.nextInt();
            //Calculo de la edad basado en los datos obtenidos
            edada = fecha_actual - fecha_nacimiento;
            System.out.print("La edad de la persona es: ");
            entrada.close();
        }
    }
}
