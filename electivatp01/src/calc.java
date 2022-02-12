//Libreria para el uso de la función Scanner
import java.util.Scanner;

public class calculator {
    
    public static void view(){
        System.out.println("Ingrese ambos numeros para realizar la operación:");
        Scanner ipn= new Scanner(System.in);
        //Variables
        int vone,vtwo;
        vone = inp.nextInt();
        vtwo = inp.nextInt();

        //Selector de casos/operación

        System.out.println("¿Que operacion desea realizar?: 1 suma, 2 resta, 3 multiplicacion, 4 division:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(sum( vone,vtwo));
            break;
        case 2:
            System.out.println(res( vone,vtwo));
            break;
        case 3:
            System.out.println(mult( vone,vtwo));
            break;
        case 4:
            System.out.println(div( vone,vtwo));
            break;
            default:
                System.out.println("Error");
        }
    }
    
    public static int sum(int a, int b)
    {
        int result = a + b;
        return result;
    }
    public static int res(int a, int b)
    {
        int result = a-b;
        return result;
    }
    public static int mult(int a, int b)
    {
        int result = a*b;
        return result;
    }
    public static int div(int a, int b)
    {
        int result = a/b;
        return result;
    }
}
