import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Clase para recibir datos por teclado
        Scanner entrada = new Scanner(System.in);
        //variabes
        final int IVA = 21;
        String precio;
        float total;
        System.out.println("Escribe el precio del producto: ");
        precio = entrada.nextLine();
        if(isNumeric(precio)){
            total = Float.parseFloat(precio) + (Float.parseFloat(precio)*IVA/100);
            System.out.println("El precio total del producto es: "+total);
        }else{
            System.out.println("El dato ingresado no es númerico.");
        }
    }
    //Funcion para comprobar si un dato es númerico.
    private static boolean isNumeric(String cadena){
        try{
            Float.parseFloat(cadena);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
