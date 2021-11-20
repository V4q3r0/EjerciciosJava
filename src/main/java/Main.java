import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Variable para sumar el precio de cada producto
        int suma = 0;

        //Array de la clase Electrodomestico
        Electrodomestico electrodomestico[] = new Electrodomestico[10];

        //Creamos por cada objeto Electrodomestico un objeto Lavadora o Televisón y le damos valores
        electrodomestico[0] = new Lavadora();
        electrodomestico[1] = new Television();
        electrodomestico[2] = new Electrodomestico();
        electrodomestico[3] = new Lavadora(500, 35);
        electrodomestico[4] = new Television(250, 50);
        electrodomestico[5] = new Electrodomestico(300, 45);
        electrodomestico[6] = new Lavadora(35);
        electrodomestico[7] = new Television(45, true);
        electrodomestico[8] = new Electrodomestico(400, "rojo", 'B',55);
        electrodomestico[9] = new Electrodomestico(200, "gris", 'C', 70);

        //Ejecutamos el método precioFinal en cada objeto y observamos el precio de cada producto
        for(int i = 0; i<= electrodomestico.length-1; i++ ){
            electrodomestico[i].precioFinal();
            if(electrodomestico[i] instanceof Lavadora){
                System.out.println("El precio de la lavadora es: "+electrodomestico[i].getPrecioBase());
            }else if(electrodomestico[i] instanceof Television){
                System.out.println("El precio del televisor es: "+electrodomestico[i].getPrecioBase());
            }else{
                System.out.println("El precio del electrodomestico es: "+electrodomestico[i].getPrecioBase());
            }
            suma += electrodomestico[i].getPrecioBase();
        }

        //Mostramos la suma total de los precios de los productos
        System.out.println("El precio total de los electrodomesticos es: "+suma);
    }
}
