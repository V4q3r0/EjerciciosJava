import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mayor = 0;
        String a, b;
        System.out.println("Escribe un número: ");
        a = entrada.nextLine();
        System.out.println("Escribe otro número para calcular: ");
        b = entrada.nextLine();
        if(isNumeric(a) && isNumeric(b)){
            if(a.equals(b)){
                System.out.println("Los números son iguales.");
                System.exit(0);
            }else if(Integer.parseInt(a) > Integer.parseInt(b)){
                mayor = Integer.parseInt(a);
            }else{
                mayor = Integer.parseInt(b);
            }
        }else{
            System.out.println("Los datos ingresados no son números, intenta de nuevo.");
            System.exit(0);
        }

        System.out.println("Entre los números "+a+" y "+b+" el mayor es: "+mayor);
    }

    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}
