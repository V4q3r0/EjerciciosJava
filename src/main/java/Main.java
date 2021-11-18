import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto para recibir datos por teclado
        Scanner entrada = new Scanner(System.in);
        //Variables
        String opt;
        do{
            System.out.println("****** GESTION CINEMATOGRAFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            System.out.println("Escribe tú opción: ");
            opt = entrada.nextLine();
            //Condiciones para para el dato, si es númerico entr (1 y 7)
            if(isNumeric(opt) && Integer.parseInt(opt) > 0 /*&& Integer.parseInt(opt) < 8*/){
                //El switch es innecesario si no realizan ninguna acción debido a la condición de (Integer.parseInt(opt) < 8!!
                switch (Integer.parseInt(opt)){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("La opción indicada no es valida.");
                }
            }else{
                System.out.println("La opción indicada no es valida");
                //Continuar programa (Se tiene que eliminar la sentencia de (Integer.parseInt(opt) < 8)
                opt = "0";
                //Terminar programa
                //System.exit(0);
            }
        }while (Integer.parseInt(opt) != 8);
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
