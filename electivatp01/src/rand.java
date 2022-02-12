//Libreria para el uso de la función random para fines del ejercicio
import java.util.Random;

public class rand {

    public static void view(){

    int min = 25;
	int max = 75;
	
		//Función antes mencionada

	Random random = new Random();

	int value = random.nextInt(maxV + minV) + minV;
	System.out.println(value);
	
    }
}
