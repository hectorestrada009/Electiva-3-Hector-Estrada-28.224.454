//Libreria de Java para detectar valores numericos
import java.util.InputMismatchException;
//Libreria para el uso de la función Scanner
import java.util.Scanner;

public class optionstp01 {

    public static void main(String[] args) {

         try (Scanner sn = new Scanner(System.in)) {

            boolean out = false;
            int opcion;
            Edad edad=new Edad();
            Temperatura temp=new Temperatura();
            Usuario user=new Usuario();
            Calculadora calc=new Calculadora();
            Aleatorio rand=new Aleatorio();
            Tablas table=new Tablas();
            while(!salir){
            //Opciones
            System.out.println("1. Edad");
            System.out.println("2. Temperatura");
            System.out.println("3. Usuario");
            System.out.println("4. Calculadora");
            System.out.println("5. Numeros aleatorios");
            System.out.println("6. Tabla");
            System.out.println("7. Cierre");
            
            try{
            
                System.out.println("Seleccione un numero para empezar: ");
                opcion = sn.nextInt();
                
                switch(opcion){

                    case 1:
                        System.out.println("");
                        edad.view();
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("");
                        temp.view();
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("");
                        user.view();
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("");
                        calc.view();
                        System.out.println("");
                        break;

                    case 5:
                        System.out.println("");
                        rand.view();
                        System.out.println("");
                        break;

                    case 6:
                        System.out.println("");
                        table.view();
                        System.out.println("");
                        break;

                    case 7:
                        salir=true;
                        break;

                    default:

                        //Opciones de salida/finales

                        System.out.println("Las opciones a elegir se encuentran entre el numero 1 y el 7");
                    }
            
                
                }catch(InputMismatchException e){
                    System.out.println("Error");
                    sn.next();
                }
            
            }
        }
        
        System.out.println("Cierre");
    }
    
}
