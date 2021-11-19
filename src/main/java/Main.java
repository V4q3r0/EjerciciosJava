import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Variable para sumar el precio de cada producto
        int suma = 0;

        //Array de la clase Electrodomestico
        Electrodomestico electrodomestico[];
        electrodomestico = new Electrodomestico[10];

        //Creamos por cada objeto Electrodomestico un objeto Lavadora o Televisón y le damos valores
        electrodomestico[0] = new Lavadora();
        electrodomestico[1] = new Television();
        electrodomestico[2] = new Lavadora(500,25);
        electrodomestico[3] = new Television(250, 32);
        electrodomestico[4] = new Lavadora(28);
        electrodomestico[5] = new Television(38,true);
        electrodomestico[6] = new Lavadora(35);
        electrodomestico[7] = new Television(45, true);
        electrodomestico[8] = new Lavadora(1000, 50);
        electrodomestico[9] = new Television(800, 65);

        //Ejecutamos el método precioFinal en cada objeto y observamos el precio de cada producto
        for(int i = 0; i<= electrodomestico.length-1; i++ ){
            electrodomestico[i].precioFinal();
            System.out.println("Precio final: "+electrodomestico[i].getPrecioBase());
            suma += electrodomestico[i].getPrecioBase();
        }

        //Mostramos la suma total de los precios de los productos
        System.out.println("El precio total de los electrodomesticos es: "+suma);
    }
}
