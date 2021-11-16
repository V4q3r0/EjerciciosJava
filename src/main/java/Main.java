import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final float PI = (float) 3.1416;
        float area = 0;
        String radio;
        System.out.println("Escribe el radio del circulo para calcular su area: ");
        radio = entrada.nextLine();
        if(isNumeric(radio)){
            if(Float.parseFloat(radio) > 0){
                area = (float) (PI*Math.pow(Double.parseDouble(radio),2));
                System.out.println("El area del circulo es: "+area);
            }else{
                System.out.println("El radio debe ser un número positivo y mayor que 0.");
                System.exit(0);
            }
        }else{
            System.out.println("El dato ingresado no es númerico.");
            System.exit(0);
        }
    }
    private static boolean isNumeric(String cadena){
        try{
            Double.parseDouble(cadena);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}
