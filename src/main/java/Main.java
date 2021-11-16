import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto para recibir datos por teclado
        Scanner entrada = new Scanner(System.in);
        String dia;
        //Se pide el dato por teclado, no se permite tíldes
        System.out.println("Escribe un dia de la semana: ");
        dia = entrada.nextLine();
        switch (dia.toLowerCase()){
            case "lunes":
                System.out.println(dia+" es un día laboral!!");
                break;
            case "martes":
                System.out.println(dia+" es un día laboral!!");
                break;
            case "miercoles":
                System.out.println(dia+" es un día laboral!!");
                break;
            case "jueves":
                System.out.println(dia+" es un día laboral!!");
                break;
            case "viernes":
                System.out.println(dia+" es un día laboral!!");
                break;
            case "sabado":
                System.out.println(dia+" NO es un día laboral!!");
                break;
            case "domingo":
                System.out.println(dia+" NO es un día laboral!!");
                break;
            default:
                System.out.println("El dato ingresado no coincide con día semanal!!");
        }
    }
}
