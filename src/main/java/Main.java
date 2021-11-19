import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objeto para recibir los datos por teclado
        Scanner entrada = new Scanner(System.in);
        //Variables
        String nombre, edad, sexo, peso, altura;
        //Pedimos los datos por teclado
        System.out.println("Escribe el nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Escribe la edad: ");
        edad = entrada.nextLine();
        System.out.println("Escribe el sexo: ");
        sexo = entrada.nextLine();
        System.out.println("Escribe el peso: ");
        peso = entrada.nextLine();
        System.out.println("Escribe la altura: ");
        altura = entrada.next();

        //Comprobamos si los datos ingresados son validos o cumplen con los requisitos
        if(!isNumeric(nombre) && isNumeric(edad) && Integer.parseInt(edad) > 0 && !isNumeric(sexo) && sexo.length() < 2 && isNumeric(peso) && isNumeric(altura)){
            //Objetos de la clase persona
            Persona persona1 = new Persona();
            Persona persona2 = new Persona(nombre, edad, sexo.charAt(0), peso, altura);
            Persona persona3 = new Persona(nombre, edad, sexo.charAt(0));

            //Seteamos los datos del objeto por defecto
            persona1.setNombre("Jose");
            persona1.setEdad("25");
            persona1.setSexo('M');
            persona1.setPeso("75");
            persona1.setAltura("1.72");

            //Comprobamos el IMC de caja objeto e imprimir su estado
            if(persona1.calcularIMC() == -1){
                System.out.println(persona1.getNombre()+" estás por DEBAJO del peso ideal.");
            }else if(persona1.calcularIMC() == 0){
                System.out.println(persona1.getNombre()+" estás en el peso ideal.");
            }else{
                System.out.println(persona1.getNombre()+" estás en SOBREPESO.");
            }

            if(persona2.calcularIMC() == -1){
                System.out.println(persona2.getNombre()+" estás por DEBAJO del peso ideal.");
            }else if(persona2.calcularIMC() == 0){
                System.out.println(persona2.getNombre()+" estás en el peso ideal.");
            }else{
                System.out.println(persona2.getNombre()+" estás en SOBREPESO.");
            }

            if(persona2.calcularIMC() == -1){
                System.out.println(persona2.getNombre()+" estás por DEBAJO del peso ideal.");
            }else if(persona2.calcularIMC() == 0){
                System.out.println(persona2.getNombre()+" estás en el peso ideal.");
            }else{
                System.out.println(persona2.getNombre()+" estás en SOBREPESO.");
            }

            //Comprobar si cada persona es mayor de edad
            if(Integer.parseInt(persona1.getEdad()) >= 18){
                System.out.println(persona1.getNombre()+" es Mayor de edad.");
            }else{
                System.out.println(persona1.getNombre()+" es Menor de edad.");
            }

            if(Integer.parseInt(persona2.getEdad()) >= 18){
                System.out.println(persona2.getNombre()+" es Mayor de edad.");
            }else{
                System.out.println(persona2.getNombre()+" es Menor de edad.");
            }

            if(Integer.parseInt(persona3.getEdad()) >= 18){
                System.out.println(persona3.getNombre()+" es Mayor de edad.");
            }else{
                System.out.println(persona3.getNombre()+" es Menor de edad.");
            }

            //Mostramos cada objeto
            persona1.aString();
            persona2.aString();
            persona3.aString();
        }else{
            System.out.println("Datos ingresados no son validos.");
            System.exit(0);
        }

    }
    private static Boolean isNumeric(String cadena){
        try{
            Float.parseFloat(cadena);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
