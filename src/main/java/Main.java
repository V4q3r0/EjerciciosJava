import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto para recibir datos por teclado
        Scanner entrada = new Scanner(System.in);
        //Variables
        String palabra1, palabra2, diferencia1 = "", diferencia2 = "";

        System.out.println("Escribe la 1 palabra: ");
        palabra1 = entrada.nextLine();
        System.out.println("Escribe la 2 palabra: ");
        palabra2 = entrada.nextLine();

        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales!!");
            System.exit(0);
        }else{
            for(int i = 0; i<palabra1.length() && i<=palabra2.length(); i++){
                if(palabra1.charAt(i) != palabra2.charAt(i)){
                    diferencia1 += palabra1.charAt(i);
                    diferencia2 += palabra2.charAt(i);
                }
            }
        }
        System.out.println("Las palabras se diferencian en: \nPalabra 1: "+diferencia1+"\nPalabra 2: "+diferencia2);
    }
}
