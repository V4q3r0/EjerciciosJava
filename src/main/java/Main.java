import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto para recibir datos por teclado
        Scanner entrada = new Scanner(System.in);
        //Variable
        String cadena;
        System.out.println("Escribe una frase: ");
        cadena = entrada.nextLine();
        System.out.println(cadena.replace(" ", ""));
    }
}
