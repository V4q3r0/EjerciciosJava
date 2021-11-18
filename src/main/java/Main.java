import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto para recibir datos por teclado
        Scanner entrada = new Scanner(System.in);
        //Variables
        String number;

        System.out.println("Escribe un número: ");
        number = entrada.nextLine();

        if(isNumeric(number) && Integer.parseInt(number) > 0){
            for(int i = Integer.parseInt(number); i <= 1000; i += 2){
                System.out.println("Número: "+i);
            }
        }else{
            System.out.println("El dato indicado no es valido\nIngresa un número entero mayor que 0.");
        }
    }

    //Función para saber si el dato ingresado es un número entero
    private static Boolean isNumeric(String cadena){
        try{
            Integer.parseInt(cadena);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
