import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto para recibir datos por teclado
        Scanner entrada = new Scanner(System.in);
        //Variable
        String num;
        do{
            System.out.println("Escribe un número: ");
            num = entrada.nextLine();
            if(isNumeric(num)){
                if(Float.parseFloat(num) >= 0){
                    System.out.println("El número es: "+num);
                }
            }else{
                System.out.println("El dato ingresado no es númerico.");
            }
        }while(Float.parseFloat(num) < 0);
    }
    //Función para saber si el dato es númerico
    private static boolean isNumeric(String cadena){
        try{
            Float.parseFloat(cadena);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
